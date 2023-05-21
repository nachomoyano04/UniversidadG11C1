/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import entidades.Alumno;
import java.sql.Connection;
import java.util.ArrayList;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author nacho y el trío Los Panchos
 */
public class InscripcionData {
    private Connection con;
    
    public InscripcionData(){
        con = Conexion.getConexion();
    }
    
    public void inscribir(Inscripcion inscripcion){   
        String sql = "INSERT INTO inscribir (id_alumno, id_materia, nota) VALUES (?,?,?)";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getId_alumno());
            ps.setInt(2, inscripcion.getMateria().getId_materia());
            ps.setDouble(3, inscripcion.getNota());
            ps.executeUpdate();
            ResultSet res = ps.getGeneratedKeys();
            if(res.next()){
                inscripcion.setId_inscripcion(res.getInt("id_inscripcion"));
                JOptionPane.showMessageDialog(null,"Inscripcion exitosa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al inscribir "+ex.getMessage());
        }
    }
    
    public ArrayList <Inscripcion> obtenerMCursadas(){
        ArrayList <Inscripcion> inscripciones = new ArrayList();
        //consulta que muestra todas las inscripciones habidas y por haber
        String sql = "SELECT m.nombre, a.nombre FROM materia m JOIN inscribir i ON m.id_materia = i.id_materia JOIN alumno a ON a.id_alumno = i.id_alumno";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.getGeneratedKeys();
            if(res.next()){
                Inscripcion insc = new Inscripcion();
                insc.setId_inscripcion(res.getInt("id_inscripcion"));
                insc.setAlumno(buscarAlumno(res.getInt("id_alumno")));
                insc.setMateria(buscarMateria(res.getInt("id_materia")));
                insc.setNota(res.getDouble("nota"));
                inscripciones.add(insc);
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al obtener lista de inscripciones "+ex.getMessage());
        }
        return inscripciones;
    }
    
    public ArrayList <Inscripcion> obtenerMCursadasPorAlumno(int id){
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        // consulta que devuelva la lista de inscripciones en las que esta el alumno sin importar que la materia este activa o no
        String sql = "SELECT m.nombre FROM materia m JOIN inscribir i ON m.id_materia = i.id_materia WHERE id_alumno = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.getGeneratedKeys();
            if(res.next()){
                Inscripcion insc = new Inscripcion();
                insc.setId_inscripcion(id);
                insc.setAlumno(buscarAlumno(res.getInt("id_alumno")));
                insc.setMateria(buscarMateria(res.getInt("id_materia")));
                insc.setNota(res.getInt("nota"));
                inscripciones.add(insc);
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al obtener lista de inscripciones "+ex.getMessage());
        } 
        return inscripciones;
    }
    
    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT  dni, apellido, nombre, fechaNacimiento FROM alumno WHERE id_alumno=? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno=new Alumno();
                alumno.setId_alumno(rs.getInt(id));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
               

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }

        return alumno;
    }
    
    public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT nombre, año FROM materia WHERE estado=1";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet res = ps.getGeneratedKeys();
            if(res.next()){
                materia = new Materia();
                materia.setId_materia(res.getInt(id));
                materia.setNombre(res.getString("nombre"));
                materia.setAnio(res.getInt("año"));
                materia.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            ps.close();
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar materia "+ex.getMessage());
        }
        return materia;
    }
    
    public ArrayList <Materia> obtenerMateriasCursadas(int id){
        ArrayList <Materia> materias = new ArrayList();
        //Consulta que devuelve la lista de materias activas que esta inscripto el id que viene por parametro
        String sql = "SELECT m.nombre FROM materia m JOIN inscribir i ON m.id_materia = i.id_materia WHERE m.estado = true AND i.id_alumno = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.getGeneratedKeys();
            ps.setInt(1, id);
            if(res.next()){
                Materia mat = new Materia();
                mat.setId_materia(res.getInt("id_materia"));
                mat.setNombre(res.getString("nombre"));
                mat.setAnio(res.getInt("año"));
                mat.setEstado(true);
                materias.add(mat);
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al obtener materias "+ex.getMessage());
        }
        return materias;
    }
    
    public ArrayList <Materia> obtenerMateriasNOCursadas(int id){
        ArrayList <Materia> materias = new ArrayList();
        String sql = "SELECT m.id_materia, m.nombre, m.año, m.estado FROM materia m WHERE m.estado = true AND NOT EXISTS (SELECT 1 FROM inscribir i WHERE i.id_alumno = ? AND i.id_materia = m.id_materia)";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.getGeneratedKeys();
            ps.setInt(1, id);
            if(res.next()){
                Materia mat = new Materia();
                mat.setId_materia(res.getInt("id_materia"));
                mat.setNombre("nombre");
                mat.setAnio(res.getInt("año"));
                mat.setEstado(true);
                materias.add(mat);
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al obtener materias "+ex.getMessage());
        }
        return materias;
    }
    
    public void desInscribir(int id_alumno, int id_materia){}
    public void desInscribir2(int id_alumno){};
    
    public void actualizarNota(int id_alumno, int id_materia){};
    
}
