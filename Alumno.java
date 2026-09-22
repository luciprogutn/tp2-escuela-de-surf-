public class Alumno {
    public static int ultimoNumero = 0;
    private String nombre;
    private String apellido;
    private String dni;
    private int numeroAlumno;
    private String nivel;


    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        ultimoNumero++;

        this.numeroAlumno = ultimoNumero;
        setNivel(nivel);
    }


    public String getNivel() {
        return nivel;
    }

    public int getnumeroAlumno() {
        return numeroAlumno;
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
        if (nivel == "principiante" || nivel == "intermedio") {
            this.nivel = nivel;
        } else {
            System.out.println("error: el nivel debe ser principiante o intermedio");
            this.nivel = "principiante";
        }
    }
        public String descripcion(){
            return "Alumno: " + nombre + " " + apellido + " " + dni + " " + nivel + " ";
        }
}

