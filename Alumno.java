public class Alumno{
    private String nombre;
    private String apellido;
    private String dni;
    private int numeroAlumno;
    private String nivel;
    static int ultimoNumero = 0;


    public Alumno(String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numeroAlumno = numeroAlumno;

        this.numeroAlumno=ultimoNumero;
            ultimoNumero++;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String descripcion() {
        return "Alumno: " + nombre + " " + apellido + " "+ dni + " " + nivel + " ";
    }
}
