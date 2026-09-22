public class Escuela {

    private String nombre;
    private String playa;

    public Escuela(String nombre, String playa){
    this.nombre = nombre;
    this.playa = playa;
    }

    public Escuela(String nombre) {
        this(nombre, "Playa Central"); // Playa por defecto
    }

    public String getNombre() {
    return nombre;
    }
    public String getPlaya() {
    return playa;
    }
    //Setters (por si cambia el nombre de la sede de la clase)
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }

    public void setPlaya(String playa) {
    this.playa = playa;
    }

    public String descripcion() {
    return "Escuela: " + nombre + " (Playa: " + playa + ")";
    }
}
