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
        String sql = "INSERT INTO inscribir (id_alumno, id_materia, nota) SELECT ?, ?, ? WHERE NOT EXISTS (SELECT 1 FROM inscribir WHERE id_alumno = ? AND id_materia = ?)";
        PreparedStatement ps = null;
            try{
                ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);            
                ps.setInt(1, inscripcion.getAlumno().getId_alumno());
                ps.setInt(2, inscripcion.getMateria().getId_materia());
                ps.setDouble(3, inscripcion.getNota());
                ps.setInt(4, inscripcion.getAlumno().getId_alumno());
                ps.setInt(5, inscripcion.getMateria().getId_materia());
                ps.executeUpdate();
                ResultSet res = ps.getGeneratedKeys();
                if(res.next()){
                    inscripcion.setId_inscripcion(res.getInt("id_inscripcion"));
                    JOptionPane.showMessageDialog(null,"Inscripcion exitosa");
                }else{
                    JOptionPane.showMessageDialog(null, "Alumno ya inscripto");
                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al inscribir "+ex.getMessage());
            }
    }
    
    public ArrayList <Inscripcion> obtenerInscripciones(){
        ArrayList <Inscripcion> inscripciones = new ArrayList();
        //consulta que muestra todas las inscripciones habidas y por haber
        String sql = "SELECT m.id_materia, a.id_alumno, i.id_inscripcion, i.nota FROM materia m JOIN inscribir i ON m.id_materia = i.id_materia JOIN alumno a ON a.id_alumno = i.id_alumno";
        PreparedStatement ps = null;
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        try{
            ps = con.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Inscripcion insc = new Inscripcion();
                insc.setId_inscripcion(res.getInt("id_inscripcion"));
                insc.setAlumno(ad.buscarAlumnoPorId(res.getInt("id_alumno")));
                insc.setMateria(md.buscarMateria(res.getInt("id_materia")));
                insc.setNota(res.getDouble("nota"));
                inscripciones.add(insc);
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al obtener lista de inscripciones "+ex.getMessage());
        }
        return inscripciones;
    }
    
    public ArrayList <Inscripcion> obtenerInscripcionesporAlumno(int id){
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        // consulta que devuelva la lista de inscripciones en las que esta el alumno sin importar que la materia este activa o no
        String sql = "SELECT m.id_materia, i.id_inscripcion, i.nota  FROM materia m JOIN inscribir i ON m.id_materia = i.id_materia WHERE id_alumno = ?";
        PreparedStatement ps = null;
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Inscripcion insc = new Inscripcion();
                insc.setId_inscripcion(res.getInt("id_inscripcion"));
                insc.setAlumno(ad.buscarAlumnoPorId(id));
                insc.setMateria(md.buscarMateria(res.getInt("id_materia")));
                insc.setNota(res.getInt("nota"));
                inscripciones.add(insc);
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al obtener lista de inscripciones "+ex.getMessage());
        } 
        return inscripciones;
    }

    public ArrayList <Materia> obtenerMateriasCursadas(int id){
        ArrayList <Materia> materias = new ArrayList();
        //Consulta que devuelve la lista de materias activas que esta inscripto el id que viene por parametro
        String sql = "SELECT m.id_materia, m.nombre, m.año FROM materia m JOIN inscribir i ON m.id_materia = i.id_materia WHERE m.estado = true AND i.id_alumno = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();
            while(res.next()){
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
        String sql = "SELECT m.id_materia, m.nombre, m.año FROM materia m WHERE m.estado = true AND NOT EXISTS (SELECT 1 FROM inscribir i WHERE i.id_alumno = ? AND i.id_materia = m.id_materia)";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();
            while(res.next()){
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
    
    public void borrarInscripcionMateriaAlumno(int id_alumno, int id_materia){
        String sql = "DELETE FROM inscribir WHERE id_alumno = ? AND id_materia = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_alumno);
            ps.setInt(2, id_materia);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Inscripcion borrada con éxito");
            }else{
                JOptionPane.showMessageDialog(null, "La inscripcion no existe");
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al borrar inscripción "+ex.getMessage());
        }
    }
    
    public void actualizarNota(int id_alumno, int id_materia, double nota){
        String sql = "UPDATE inscribir SET nota = ? WHERE id_alumno = ? AND id_materia = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, id_alumno);
            ps.setInt(3, id_materia);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Nota actualizada con éxito");
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al actualizar nota");
        }
    }
    
    public ArrayList<Alumno> obtenerAlumnosXMateria(int id_materia){
        ArrayList<Alumno>alumnos = new ArrayList();
        String sql = "SELECT a.id_alumno, a.nombre, a.apellido, a.dni, a.fechaNacimiento FROM alumno a JOIN inscribir i ON a.id_alumno = i.id_alumno JOIN materia m ON m.id_materia = i.id_materia WHERE i.id_materia = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_materia);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Alumno alumno = new Alumno();
                alumno.setId_alumno(res.getInt("id_alumno"));
                alumno.setNombre(res.getString("nombre"));
                alumno.setApellido(res.getString("apellido"));
                alumno.setDni(res.getInt("dni"));
                alumno.setFechaNacimiento(res.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al obtener los alumnos "+ex.getMessage());
        }
        return alumnos;
    }
    
}
