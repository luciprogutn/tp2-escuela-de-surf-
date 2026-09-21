public class Instructor{

    private String nombre;
    private String apellido;
    private int matricula;

    public Instructor(String nombre, String apellido, int matricula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;

    }

    public int getMatricula() {

        return matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String descripcion(){
        return "Instructor: " + nombre + " " + apellido + " (Matrícula: " + matricula + " ";
    }
}