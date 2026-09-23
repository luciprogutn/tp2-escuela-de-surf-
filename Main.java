public class Main {
    public static void main(String[] args) {
        // -------------------------------------------------------------
        // D.1: CREACIÓN DE OBJETOS SEGÚN SUS CONSTRUCTORES EXACTOS
        // -------------------------------------------------------------
        Escuela escuela = new Escuela("Escuela Surf Necochea", "Playa Principal");

        Instructor instructor1 = new Instructor("Carlos", "Gómez", 1001);
        Instructor instructor2 = new Instructor("Mariana", "López", 1002);

        // Tabla: (int codigo, double largoPies, boolean enReparacion)
        Tabla tabla1 = new Tabla(1, 7.5, false);
        Tabla tabla2 = new Tabla(2, 8.0, false);
        Tabla tabla3 = new Tabla(3, 6.8, false);
        Tabla tabla4 = new Tabla(4, 9.0, false);

        // Alumno: (String nombre, String apellido, String dni)
        // Instanciación pasando: nombre, apellido, dni y nivel
        Alumno alumno1 = new Alumno("Yoi", "Pérez", "40123456", "principiante");
        Alumno alumno2 = new Alumno("Lucas", "Rodríguez", "41234567", "intermedio");
        Alumno alumno3 = new Alumno("Sofia", "Martínez", "42345678", "principiante");
        Alumno alumno4 = new Alumno("Mateo", "García", "43456789", "principiante");
        Alumno alumno5 = new Alumno("Valentina", "Díaz", "44567890", "intermedio");


              // Turno: (int cupoMaximo, String fecha, String horario, Instructor instructor)
        Turno turno1 = new Turno(2, "2026-10-01", "09:00 AM", instructor1);
        Turno turno2 = new Turno(2, "2026-10-01", "11:00 AM", instructor2);


        // -------------------------------------------------------------
        // D.2: REGISTRO Y MUESTREO DE INSCRIPCIONES
        // -------------------------------------------------------------
        System.out.println("==============================================");
        System.out.println("          INSCRIPCIONES REGISTRADAS           ");
        System.out.println("==============================================");

        Inscripcion inscripcion1 = new Inscripcion("2026-10-01", alumno1, turno1, tabla1);
        Inscripcion inscripcion2 = new Inscripcion("2026-10-01", alumno2, turno1, tabla2);
        Inscripcion inscripcion3 = new Inscripcion("2026-10-01", alumno3, turno2, tabla3);

        // Asignación de asistencia
        inscripcion1.registrarAsistencia(true);
        inscripcion2.registrarAsistencia(true);
        inscripcion3.registrarAsistencia(false);

        // Muestreo con el método descripcion() de tu clase inscripcion
        System.out.println(inscripcion1.descripcion());
        System.out.println(inscripcion2.descripcion());
        System.out.println(inscripcion3.descripcion());


        // -------------------------------------------------------------
        // D.4: REPORTES Y ESTADÍSTICAS
        // -------------------------------------------------------------
        System.out.println("\n==============================================");
        System.out.println("             REPORTES DEL SISTEMA             ");
        System.out.println("==============================================");

        // Cambiamos el estado de una tabla para la prueba
        tabla3.setEnReparacion(true);

        int tablasEnReparacion = 0;
        if (tabla1.isEnReparacion()) tablasEnReparacion++;
        if (tabla2.isEnReparacion()) tablasEnReparacion++;
        if (tabla3.isEnReparacion()) tablasEnReparacion++;
        if (tabla4.isEnReparacion()) tablasEnReparacion++;

        System.out.println("Cantidad de tablas en reparación: " + tablasEnReparacion);

        // Cálculo de asistencia del Turno 1
        int totalInscriptosTurno1 = 2;
        int presentesTurno1 = 0;

        if (Boolean.TRUE.equals(inscripcion1.getAsistio())) presentesTurno1++;
        if (Boolean.TRUE.equals(inscripcion2.getAsistio())) presentesTurno1++;

        double porcentajeAsistencia = ((double) presentesTurno1 / totalInscriptosTurno1) * 100.0;
        System.out.printf("Porcentaje de asistencia (Turno 1 - 09:00 AM): %.2f%%\n", porcentajeAsistencia);


        // -------------------------------------------------------------
        // D.5: VERIFICACIÓN DE NUMERACIÓN AUTONUMÉRICA (Alumno)
        // -------------------------------------------------------------
        System.out.println("\n==============================================");
        System.out.println("        NÚMEROS CORRELATIVOS DE ALUMNOS       ");
        System.out.println("==============================================");

        System.out.println("Alumno: " + alumno1.getNombre() + " " + alumno1.getApellido() + " -> Nº Alumno: " + alumno1.getnumeroAlumno() + " " + "Nivel: " + alumno1.getNivel());
        System.out.println("Alumno: " + alumno2.getNombre() + " " + alumno2.getApellido() + " -> Nº Alumno: " + alumno2.getnumeroAlumno() + " " + "Nivel: " + alumno2.getNivel());
        System.out.println("Alumno: " + alumno3.getNombre() + " " + alumno3.getApellido() + " -> Nº Alumno: " + alumno3.getnumeroAlumno() + " " + "Nivel: " + alumno3.getNivel());
        System.out.println("Alumno: " + alumno4.getNombre() + " " + alumno4.getApellido() + " -> Nº Alumno: " + alumno4.getnumeroAlumno() + " " + "Nivel: " + alumno4.getNivel());
        System.out.println("Alumno: " + alumno5.getNombre() + " " + alumno5.getApellido() + " -> Nº Alumno: " + alumno5.getnumeroAlumno() + " " + "Nivel: " + alumno5.getNivel());
    }
}