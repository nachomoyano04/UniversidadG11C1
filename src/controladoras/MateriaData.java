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

    public MateriaData(){
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS) ;
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
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
        //String sql = "SELECT nombre, año FROM materia WHERE estado=1 AND id_materia = ?";
        String sql = "SELECT nombre, año, estado FROM materia WHERE id_materia = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                materia = new Materia();
                materia.setId_materia(id);
                materia.setNombre(res.getString("nombre"));
                materia.setAnio(res.getInt("año"));
               // materia.setEstado(true);
                materia.setEstado(res.getBoolean("estado"));
            }
            ps.close();
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar materia "+ex.getMessage());
        }
        return materia;
    }
    
    public Materia modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ?, año = ? WHERE id_materia = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getId_materia());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Materia modificada");
            }
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
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar materia " + ex.getMessage());
        }
    }

    public ArrayList<Materia> listarMaterias(){
        ArrayList<Materia>materias = new ArrayList();
        try{        
            String sql = "SELECT * FROM materia WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
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
