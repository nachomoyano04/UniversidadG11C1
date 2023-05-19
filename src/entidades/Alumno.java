/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author nacho
 */
public class Alumno {
    
    private int id_alumno;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private boolean estado;
    
    // constructor vacio
    public Alumno() {
    }
    
    // constructor sin id
    public Alumno(int dni, String nombre, String apellido, LocalDate fechaNacimiento, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }
    
    // constructor con id
    public Alumno(int id_alumno, int dni, String nombre, String apellido, LocalDate fechaNacimiento, boolean estado) {
        this.id_alumno = id_alumno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  dni + ", " + nombre + ", " + apellido;
    }
       
}
