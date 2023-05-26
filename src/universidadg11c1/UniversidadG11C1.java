package universidadg11c1;

import controladoras.AlumnoData;
import controladoras.InscripcionData;
import controladoras.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
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
//        /*DAR DE ALTA A ALUMNOS Y MATERIAS*/
//        Alumno alumno = new Alumno(4, 24688722, "Marcel", "Olguin", LocalDate.of(1976, 8, 12), true);
//        AlumnoData ad = new AlumnoData();
//        Materia materia = new Materia(3, "Inglés", 2, true);
//        MateriaData md = new MateriaData();
//        md.guardarMateria(materia);
//
//        //ad.guardarAlumno(alumno);
//        //md.guardarMateria(materia);
//
//        /*BUSQUEDA DE ALUMNOS*/
//        System.out.println("...Buscamos alumnos por id...");
//        System.out.println(ad.buscarAlumnoPorId(1));
//        System.out.println("...Buscamos materias por id...");
//        System.out.println(md.buscarMateria(1));
//        System.out.println("...Buscamos alumnos por DNI...");
//        System.out.println(ad.buscarAlumnoPorDni(34556566));
//        System.out.println("\n...Lista de alumnos...");
//        for (Alumno listarAlumno : ad.listarAlumnos()) {
//            System.out.println(listarAlumno);
//        }
//        System.out.println("...Modificamos alumno...");
//        ad.modificarAlumno(alumno);
//        System.out.println("...Eliminamos un alumno...");
//        ad.eliminarAlumno(2);
//        System.out.println("\n...Lista de alumnos...");
//        for (Alumno listarAlumno : ad.listarAlumnos()) {
//            System.out.println(listarAlumno);
//        }
//        System.out.println("...Lo activamos nuevamente...");
//        ad.activarAlumno(2);
//        System.out.println("Lista de materias");
//        for (Materia li : md.listarMaterias()) {
//            System.out.println(li);
//        }
//        System.out.println("Buscamos la materia con id 3");
//        if (md.buscarMateria(3)!=null){
//            System.out.println(md.buscarMateria(3).getNombre());
//        } else{
//            System.out.println("Materia no encontrada o inactiva.");
//        }
//        System.out.println("Modificamos una materia");
//        md.modificarMateria(materia);
//        for (Materia listarMateria : md.listarMaterias()) {
//            System.out.println(listarMateria);
//        }
//        System.out.println("Eliminamos una materia");
//        md.elminarMateria(3);
//        for (Materia listarMateria : md.listarMaterias()) {
//            System.out.println(listarMateria);
//        }
//        System.out.println("Activamos una materia");
//        md.activarMateria(4);
//        Inscripcion inscripcion = new Inscripcion(alumno, materia, 0);
//        InscripcionData id = new InscripcionData();
//        id.inscribir(inscripcion);
//        id.inscribir(inscripcion);
//        id.borrarInscripcionMateriaAlumno(1, 2);
//        id.actualizarNota(2, 1, 5);
//            for (Alumno alumno1 : id.obtenerAlumnosXMateria(2)) {
//                System.out.println(alumno1.getNombre()+" "+alumno1.getApellido());
//            }
//        
//            for (Inscripcion obtenerInscripcione : id.obtenerInscripciones()) {
//                System.out.println(obtenerInscripcione.getAlumno().toString()+" "+obtenerInscripcione.getMateria().toString());
//        }
//            for (Inscripcion inscripcion1 : id.obtenerInscripcionesporAlumno(2)) {
//                System.out.println(inscripcion1.getAlumno().getNombre()+" "+inscripcion1.getMateria().getNombre());
//        }
//        System.out.println("Cursadas");
//        for (Materia obtenerMateriasCursada : id.obtenerMateriasCursadas(6)) {
//            System.out.println(obtenerMateriasCursada.getNombre());
//        }
//        System.out.println("NO CURSADASSSS");
//        for (Materia obtenerMateriasNOCursada : id.obtenerMateriasNOCursadas(6)) {
//            System.out.println(obtenerMateriasNOCursada.getNombre());
//        }
    }
}
