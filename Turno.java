public class Turno {
    public static final int CUPO_MAXIMO = 10;

    private String fecha;
    private String horario;
    private Instructor instructor;
    private int cantidadInscriptos;
    private int cupo;
    private Inscripcion[] inscripciones;


    public Turno(int cupo, String fecha, String horario, Instructor instructor) {
        setCupo(cupo);
        this.fecha = fecha;
        this.horario = horario;
        this.instructor = instructor;
        this.cantidadInscriptos = 0;
        this.inscripciones = new Inscripcion[this.cupo];

    }

    public Turno(String fecha, String horario, Instructor instructor) {
        this(CUPO_MAXIMO, fecha, horario, instructor);

    }

    public void setCupo(int cupo) {
        if (cupo >= 1) {
            this.cupo = cupo;
        } else {
            System.out.println("error el cupo del cupo no puede ser menor a 1");
            this.cupo = 1;
        }
    }

    public int getCantidadInscriptos() {
        return cantidadInscriptos;
    }

    public int getCUPO_MAXIMO() {
        return CUPO_MAXIMO;
    }

    public String getfecha() {
        return fecha;
    }

    public String gethorario() {
        return horario;
    }

    public boolean hayCupo() {
        return cantidadInscriptos < cupo;
    }


    public boolean agregarInscripcion(Inscripcion inscripcion) {
        if (hayCupo()) {
            inscripciones[cantidadInscriptos] = inscripcion;
            cantidadInscriptos++;
            return true;
        } else {
            System.out.println("aviso: el turno" + fecha + " " + horario + " no tiene cupo disponible");
            return false;
        }
    }

    public Instructor getInstructor() {
        return instructor;
    }


    public String descripcion() {
        String profe;
        if (instructor != null) {
            profe = "instructor.getnombre" + " " + "instructor.getapellido";
        } else {
            profe = "sinInstructor";
        }
        return "Turno: " + horario + " - " + fecha + " instructor:" + profe + "inscriptos:" + cantidadInscriptos + "/" + cupo;
    }

}