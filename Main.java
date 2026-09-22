public class Main {
    public static void main(String[] args) {
        // --- D.1: OBJETOS ---
        Escuela escuela = new Escuela("Escuela Surf Necochea", "Playa Principal");

        Instructor instructor1 = new Instructor("Carlos", "Gómez", 1001);
        Instructor instructor2 = new Instructor("Mariana", "López", 1002);

        Tabla tabla1 = new Tabla(1, 7.5);
        Tabla tabla2 = new Tabla(2, 8.0);
        Tabla tabla3 = new Tabla(3, 6.8);
        Tabla tabla4 = new Tabla(4, 9.0);

        Turno turno1 = new Turno(2, "2026-10-01", "09:00 AM", instructor1);
        Turno turno2 = new Turno(2, "2026-10-01", "11:00 AM", instructor1);
        Turno turno3 = new Turno(2, "2026-10-01", "03:00 PM", instructor2);

        Alumno alumno1 = new Alumno("Yoi", "Pérez", "40123456");
        Alumno alumno2 = new Alumno("Lucas", "Rodríguez", "41234567");
        Alumno alumno3 = new Alumno("Sofia", "Martínez", "42345678");
        Alumno alumno4 = new Alumno("Mateo", "García", "43456789");
        Alumno alumno5 = new Alumno("Valentina", "Díaz", "44567890");


        // --- D.2: REGISTRO DE INSCRIPCIONES ---
        System.out.println("==============================================");
        System.out.println("PARTE D.2: INSCRIPCIONES REALIZADAS");
        System.out.println("==============================================");

        Inscripcion inscripcion1 = new Inscripcion("2026-10-01", alumno1, turno1, tabla1);
        Inscripcion inscripcion2 = new Inscripcion("2026-10-01", alumno1, turno2, tabla2);
        Inscripcion inscripcion3 = new Inscripcion("2026-10-01", alumno2, turno1, tabla3);

        inscripcion1.registrarAsistencia(true);
        inscripcion3.registrarAsistencia(false);

        System.out.println(inscripcion1.descripcion());
        System.out.println(inscripcion2.descripcion());
        System.out.println(inscripcion3.descripcion());


        // --- D.3: VALIDACIÓN DE CUPO LLENO ---
        System.out.println("\n==============================================");
        System.out.println("PARTE D.3: VALIDACIÓN DE CUPO LLENO");
        System.out.println("==============================================");

        // Preguntamos al turno si tiene cupo antes de anotar al alumno
        if (turno1.hayCupo()) {
            Inscripcion inscripcionExceso = new Inscripcion("2026-10-01", alumno3, turno1, tabla4);
            System.out.println(inscripcionExceso.descripcion());
        } else {
            System.out.println("⚠️ No se pudo inscribir a " + alumno3.getNombre() + " " + alumno3.getApellido() +
                    ": El " + turno1.descripcion() + " ya alcanzó su cupo máximo (" + turno1.getCupoMaximo() + ").");
        }


        // --- D.4: REPORTES ---
        System.out.println("\n==============================================");
        System.out.println("PARTE D.4: REPORTES Y ESTADÍSTICAS");
        System.out.println("==============================================");

        // D.4.1 Lista de turnos con inscriptos reales
        System.out.println("--- D.4.1: Lista de Turnos ---");
        System.out.println("- " + turno1.descripcion() + " | Instructor: " + turno1.getInstructor().getNombre() + " | Inscriptos: " + turno1.getCantidadInscriptos());
        System.out.println("- " + turno2.descripcion() + " | Instructor: " + turno2.getInstructor().getNombre() + " | Inscriptos: " + turno2.getCantidadInscriptos());
        System.out.println("- " + turno3.descripcion() + " | Instructor: " + turno3.getInstructor().getNombre() + " | Inscriptos: " + turno3.getCantidadInscriptos());

        // D.4.2 Turnos de un alumno
        System.out.println("\n--- D.4.2: Turnos del Alumno " + alumno1.getNombre() + " ---");
        System.out.println(" 1. " + inscripcion1.getTurno().descripcion());
        System.out.println(" 2. " + inscripcion2.getTurno().descripcion());

        // D.4.3 Tablas en reparación
        System.out.println("\n--- D.4.3: Tablas en Reparación ---");
        tabla3.setEnReparacion(true);
        int tablasEnReparacion = 0;
        if (tabla1.enReparacion()) tablasEnReparacion++;
        if (tabla2.enReparacion()) tablasEnReparacion++;
        if (tabla3.enReparacion()) tablasEnReparacion++;
        if (tabla4.enReparacion()) tablasEnReparacion++;
        System.out.println("Cantidad total de tablas en reparación: " + tablasEnReparacion);

        // D.4.4 Porcentaje de asistencia de Turno 1
        System.out.println("\n--- D.4.4: Porcentaje de Asistencia ---");
        int presentes = 0;
        if (Boolean.TRUE.equals(inscripcion1.getAsistio())) presentes++;
        if (Boolean.TRUE.equals(inscripcion3.getAsistio())) presentes++;

        double porcentaje = ((double) presentes / turno1.getCantidadInscriptos()) * 100.0;
        System.out.printf("Porcentaje de asistencia del Turno 1: %.2f%%\n", porcentaje);


        // --- D.5: VERIFICACIÓN CORRELATIVOS (1 AL 5) ---
        System.out.println("\n==============================================");
        System.out.println("PARTE D.5: VERIFICACIÓN DE NÚMEROS CORRELATIVOS (1 AL 5)");
        System.out.println("==============================================");
        System.out.println(alumno1.descripcion());
        System.out.println(alumno2.descripcion());
        System.out.println(alumno3.descripcion());
        System.out.println(alumno4.descripcion());
        System.out.println(alumno5.descripcion());
    }
}