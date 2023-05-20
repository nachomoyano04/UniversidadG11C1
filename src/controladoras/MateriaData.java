/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import entidades.Materia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho y el trío Los Panchos
 */
public class MateriaData {
    
    private Connection con = null;
    private Conexion conexion;

    public MateriaData(){
        con = conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS) ;
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(1, materia.isEstado());
            ps.executeUpdate();
            ResultSet res = ps.getGeneratedKeys();
            if(res.next()){
                materia.setId_materia(res.getInt("id_materia"));
                JOptionPane.showMessageDialog(null, "Materia cargada con éxito");
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar materia "+ex.getMessage());
        }
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
    
    public Materia modificarMateria(/*int id,*/ Materia materia){
        String sql = "UPDATE materia SET nombre = ?, año = ? WHERE id_materia = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getId_materia());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Materia modificada");
            } /*else{
                JOptionPane.showMessageDialog(null,"La materia no existe");
            }*/
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al modificar materia "+ ex.getMessage());
        }
        return materia;
    }
    
    public void elminarMateria(int id){
        String sql = "UPDATE materia SET estado = false WHERE id_Materia = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Materia eliminada");
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar materia " + ex.getMessage());
        }
    }

    public ArrayList<Materia> listarMaterias(){
        ArrayList<Materia>materias = new ArrayList();
        String sql = "SELECT * FROM materia WHERE estado = true";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.getGeneratedKeys();
            if(res.next()){
                Materia mat = new Materia();
                mat.setId_materia(res.getInt("id_materia"));
                mat.setNombre(res.getString("nombre"));
                mat.setAnio(res.getInt("año"));
                mat.setEstado(true);
                materias.add(mat);
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al mostrar materias "+ ex.getMessage());
        }
        return materias;
    }
    
    public void activarMateria(int id){
        String sql = "UPDATE materia SET estado = true WHERE id_materia = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Materia activada");
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al activar materia "+ ex.getMessage());
        }
    }
}
