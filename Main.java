public class Main {
    public static void main(String[] args) {
        // 1. Crear la escuela
        Escuela escuela = new Escuela("Escuela Surf Necochea", "Playa Principal");

        // 2. Crear los dos instructores
        Instructor instructor1 = new Instructor("Carlos", "Gómez", 1001);
        Instructor instructor2 = new Instructor("Mariana", "López", 1002);

        // 3. Crear las cuatro tablas (código entero y largo en pies)
        Tabla tabla1 = new Tabla(1, 7.5);
        Tabla tabla2 = new Tabla(2, 8.0);
        Tabla tabla3 = new Tabla(3, 6.8);
        Tabla tabla4 = new Tabla(4, 9.0);

        // 4. Crear los tres turnos (agregando el entero al principio para el cupo)
        Turno turno1 = new Turno(5, "2026-10-01", "09:00 AM", instructor1);
        Turno turno2 = new Turno(5, "2026-10-01", "11:00 AM", instructor1);
        Turno turno3 = new Turno(5, "2026-10-01", "03:00 PM", instructor2);

        // 5. Crear los cinco alumnos (con los 3 parámetros de su constructor: nombre, apellido, DNI)
        Alumno alumno1 = new Alumno("Yoi", "Pérez", "40123456");
        Alumno alumno2 = new Alumno("Lucas", "Rodríguez", "41234567");
        Alumno alumno3 = new Alumno("Sofia", "Martínez", "42345678");
        Alumno alumno4 = new Alumno("Mateo", "García", "43456789");
        Alumno alumno5 = new Alumno("Valentina", "Díaz", "44567890");

        // Asignarle el nivel a un alumno si usaron el setter
        alumno1.setNivel("principiante");

        // --- MOSTRAR DESCRIPCIONES EN CONSOLA ---
        System.out.println("=== DATOS CARGADOS EN EL SISTEMA ===");
        System.out.println(escuela.descripcion());
        System.out.println(instructor1.descripcion());
        System.out.println(tabla1.descripcion());
        System.out.println(alumno1.descripcion());


        // 6. Realizar inscripciones (Parte D.2)
        Inscripcion inscripcion1 = new Inscripcion("2026-10-01", alumno1, turno1, tabla1);
        Inscripcion inscripcion2 = new Inscripcion("2026-10-01", alumno2, turno1, tabla2);
        Inscripcion inscripcion3 = new Inscripcion("2026-10-01", alumno3, turno2, tabla3);
        // 7. Simular registro de asistencia
        inscripcion1.registrarAsistencia(true);

        // 8. Mostrar la descripción de las inscripciones
        System.out.println("\n=== INSCRIPCIONES Y ASISTENCIAS ===");
        System.out.println(inscripcion1.descripcion());
        System.out.println(inscripcion2.descripcion());
        System.out.println(inscripcion3.descripcion());
    }
}