TP2 - Escuela de Surf
# TP2 - Escuela de Surf

**Integrantes del grupo:**
- [carrasco sanzana joana]
- [carrasco sanzana luciana]

---

//Quién hizo qué, en una lista de dos o tres líneas por persona.
LUCIANA: inicie el repositorio en GitHub, hice el archivo README.md, .gitignore.
luego hice la clase Turno.java, Tabla.java, y Alumno.java. commitee cada una de las clases,
con sus respectivos codigos, unifique ramas de mi compañera para avnzar, modifique, corregi, etc.
JOANA: Resolvi errores puntuales en git, cree las clases escuela, intructor, inscripcion, main,
sincronice ramas, corregi los contructores y la visibilidad
de los metodos en inscripcion, escuela y alumno para solucionar fallos de compilacion

*Aunque ambas corregimos cosas de las otras, y creamos el main juntas.

¿como compilamos?
javac Main.java 
java Main.java
prueba de compilacion: *.java


## Preguntas

### 1. Clase propia para la relación (`Inscripción`)
Si no creábamos `Inscripción`, aparecían **atributos huérfanos** como `asistio` o `fechaInscripcion`. Por ejemplo, si guardábamos `asistio` en `Alumno`, no sabríamos a qué turno asistió; y si lo guardábamos en `Turno`, no sabríamos qué alumno asistió. `Inscripción` une al Alumno, al Turno y a la Tabla asignada registrando el estado de ese vínculo.

### 2. Elección del rombo (Composición entre `Escuela` y `Turno`)
Elegimos **composición (rombo relleno)** entre `Escuela` y `Turno` basándonos en la frase del enunciado: *"Si la escuela cierra, sus turnos dejan de existir". Esto indica una dependencia total del ciclo de vida del turno respecto de la escuela, a diferencia de una agregación simple donde el turno podría existir de forma independiente.

### 3. Contador `static` para `numeroAlumno`
Si el contador lo llevaba el `main`, la lógica de negocio quedaba expuesta fuera de la clase `Alumno` y cualquier parte del código podía crear un alumno con un número inválido o duplicado. El sistema no debe depender de esto porque viola la **encapsulación** y la autonomía de la clase para garantizar la autogeneración correcta de sus IDs.

### 4. Conflicto de merge
Tuvimos un conflicto en el archivo `Main.java` (y en las clases del dominio) al intentar integrar los cambios de ambas ramas, ya que se habían modificado líneas superpuestas y una rama usaba versiones viejas de las clases. Lo resolvimos revisando el código en Git Bash, descartando los cambios desactualizados e incorporando manualmente las clases corregidas junto con el `Main` definitivo.