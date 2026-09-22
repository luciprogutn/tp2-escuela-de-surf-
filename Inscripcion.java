public class Inscripcion {
    private String fechaInscripcion;
    private Boolean asistio;
    private Alumno alumno;
    private Turno turno;
    private Tabla tabla;

    public Inscripcion(String fechaInscripcion, Alumno alumno, Turno turno, Tabla tabla) {
        this.fechaInscripcion = fechaInscripcion;
        this.alumno = alumno;
        this.turno = turno;
        this.tabla = tabla;
        this.asistio = false;


        turno.sumarInscripto();
    }

    public Boolean getAsistio() {
        return asistio;
    }

    public void registrarAsistencia(boolean asistio) {
        this.asistio = asistio;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Turno getTurno() {
        return turno;
    }

    public String descripcion() {
        String estado = (asistio != null && asistio) ? "Presente" : "Ausente";
        return "Inscripción de " + alumno.getNombre() + " " + alumno.getApellido() +
                " | Asistencia: " + estado;
    }
}