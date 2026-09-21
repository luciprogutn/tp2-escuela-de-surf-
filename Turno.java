public class Turno {
    static final int CUPO_MAXIMO = 10;
    private String fecha;
    private String horario;
    private Instructor instructor;


    public Turno(String fecha, String horario, Instructor instructor) {
        this.fecha = fecha;
        this.horario = horario;
        this.instructor = instructor;

    }

    public String getFecha() {

        return fecha;
    }

    public String getHorario() {
        return horario;
    }

    public Instructor getInstructor() {

        return instructor;
    }

    public int getCupoMaximo() {
        return CUPO_MAXIMO;
    }

    public String descripcion() {
        return "Turno: " + fecha + " " + horario + " (Instructor: " + instructor.getNombre() + " " + instructor.getApellido() + ")";
    }
}