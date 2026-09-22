public class Turno {
    private int cupoMaximo;
    private String fecha;
    private String horario;
    private Instructor instructor;
    private int cantidadInscriptos;

    public Turno(int cupoMaximo, String fecha, String horario, Instructor instructor) {
        this.cupoMaximo = cupoMaximo;
        this.fecha = fecha;
        this.horario = horario;
        this.instructor = instructor;
        this.cantidadInscriptos = 0;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public int getCantidadInscriptos() {
        return cantidadInscriptos;
    }

    public boolean hayCupo() {
        return cantidadInscriptos < cupoMaximo;
    }

    public void sumarInscripto() {
        if (hayCupo()) {
            cantidadInscriptos++;
        }
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String descripcion() {
        return "Turno (" + horario + " - " + fecha + ")";
    }
}
