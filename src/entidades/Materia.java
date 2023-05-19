package entidades;

public class Materia {
    //atributos materia
    private int id_materia;
    private String nombre;
    private int año;
    private boolean estado;
    
    // 3 constructores
    public Materia() {
    }

    public Materia(int id_materia, String nombre, int año, boolean estado) {
        this.id_materia = id_materia;
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public Materia(String nombre, int año, boolean estado) {
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }
    
    //metodos getter y settters

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //modificamos metodo toString para pronta utilizacion en vistas

    @Override
    public String toString() {
        return  nombre + " " + año + " " + estado;
    }
    
}
