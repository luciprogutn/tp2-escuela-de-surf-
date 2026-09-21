public class Turno{
    private int cupoMaximo;
    private String fecha;
    private String horario;
    private Instructor instructor;


    public Turno(int cupoMaximo, String fecha, String horario, Instructor instructor){
        this.cupoMaximo = cupoMaximo;
        this.fecha = fecha;
        this.horario = horario;
        this.instructor = instructor;

    }

    public int getCupoMaximo() {
        return cupoMaximo;
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
}
