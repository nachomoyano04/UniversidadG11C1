/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author nacho
 */
public class Inscripcion {
    //atributos inscripcion
    private int id_inscripcion; 
    private Alumno alumno; 
    private Materia materia; 
    private double nota;
    
    //3 constructores

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(int id_inscripcion, Alumno alumno, Materia materia, double nota) {
        this.id_inscripcion = id_inscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
    
    //getters and setters

    public int getId_inscripcion() {
        return id_inscripcion;
    }

    public void setId_inscripcion(int id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //override del metodo to String para pronta utilizacion en vistas
    @Override
    public String toString() {
        return alumno + " " + materia + " " + nota;
    }
    
    
}
