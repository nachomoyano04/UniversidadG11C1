package entidades;

public class Materia {
    //atributos materia
    private int id_materia;
    private String nombre;
    private int anio;
    private boolean estado;
    
    // 3 constructores
    public Materia() {
    }

    public Materia(int id_materia, String nombre, int anio, boolean estado) {
        this.id_materia = id_materia;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia(String nombre, int anio, boolean estado) {
        this.nombre = nombre;
        this.anio = anio;
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
        return anio;
    }

    public void setAño(int anio) {
        this.anio = anio;
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
        return  nombre + " " + anio + " " + estado;
    }
    
}
