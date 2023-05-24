/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadg11c1;

import controladoras.AlumnoData;
import controladoras.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.time.LocalDate;

/**
 *
 * @author nacho
 */
public class UniversidadG11C1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*DAR DE ALTA A ALUMNOS Y MATERIAS*/
        Alumno alumno = new Alumno(6, 32323232, "Marcelo", "Gallardo", LocalDate.of(1978, 11, 19), true);
        AlumnoData ad = new AlumnoData();
        Materia materia = new Materia("Álgebra1", 6, true);
        MateriaData md = new MateriaData();
        //ad.guardarAlumno(alumno);
        //md.guardarMateria(materia);

        /*BUSQUEDA DE ALUMNOS*/
        System.out.println("...Buscamos alumnos por id...");
        System.out.println(ad.buscarAlumnoPorId(1));
        System.out.println("...Buscamos materias por id...");
        System.out.println(md.buscarMateria(1));
        System.out.println("...Buscamos alumnos por DNI...");
        System.out.println(ad.buscarAlumnoPorDni(34556566));
        System.out.println("\n...Lista de alumnos...");
        for (Alumno listarAlumno : ad.listarAlumnos()) {
            System.out.println(listarAlumno);
        }
        System.out.println("...Modificamos alumno...");
        ad.modificarAlumno(alumno);
        System.out.println("...Eliminamos un alumno...");
        ad.eliminarAlumno(2);
        System.out.println("\n...Lista de alumnos...");
        for (Alumno listarAlumno : ad.listarAlumnos()) {
            System.out.println(listarAlumno);
        }
        System.out.println("...Lo activamos nuevamente...");
        ad.activarAlumno(2);
        System.out.println("Lista de materias");
        for (Materia li : md.listarMaterias()) {
            System.out.println(li);
        }
        System.out.println("Buscamos la materia con id 3");
        System.out.println(md.buscarMateria(3).getNombre());
        System.out.println("Modificamos una materia");
        md.modificarMateria(materia);
        for (Materia listarMateria : md.listarMaterias()) {
            System.out.println(listarMateria);
        }
        System.out.println("Eliminamos una materia");
        md.elminarMateria(3);
        for (Materia listarMateria : md.listarMaterias()) {
            System.out.println(listarMateria);
        }
        System.out.println("Activamos una materia");
        md.activarMateria(4);
    }

}
