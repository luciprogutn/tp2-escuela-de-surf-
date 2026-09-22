public class Inscripcion{
    private String fechaInscripcion;
    private Boolean asistio;

    private Alumno alumno;
    private Turno turno;
    private Tabla tabla;

    public Inscripcion(String fechaInscripcion, Alumno alumno, Turno turno, Tabla tabla ){
        this.fechaInscripcion = fechaInscripcion;
        this.alumno = alumno;
        this.turno = turno;
        this.tabla = tabla;
        this.asistio = false;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Boolean getAsistio() {
        return asistio;
    }

    public void setAsistio(Boolean asistio) {
        this.asistio = asistio;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Tabla getTabla() {
        return tabla;
    }

    public void setTabla(Tabla tabla) {
        this.tabla = tabla;
    }

    public void registrarAsistencia(boolean asistio) {
        this.asistio = asistio;
    }

    // Método descripcion() obligatorio (Parte C.7)
    public String descripcion() {
        String estadoAsistencia = (asistio != null && asistio) ? "Presente" : "Ausente / Pendiente";
        return "Inscripción de " + alumno.getNombre() + " " + alumno.getApellido() +
                " - Fecha: " + fechaInscripcion +
                " - Asistencia: " + estadoAsistencia;
    }
}