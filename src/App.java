public class App {
    public static void main(String[] args) {

        // Carrera
        Carrera carreraSistemas = new Carrera("Ingeniería en Sistemas");

        // Estudiantes (usando setters si querés el constructor vacío)
        Estudiante e1 = new Estudiante();
        e1.setNombre("Ana");
        e1.setApellido("Pérez");
        e1.setEdad(20);
        e1.setCarrera("Ingeniería");
        e1.setPromedio(0); // se recalcula

        Estudiante e2 = new Estudiante("Luis", "Gómez", 22, "Medicina", 0);
        Estudiante e3 = new Estudiante("María", "López", 19, "Derecho", 0);

        // Agregar materias a los estudiantes
        e1.agregarMateria(new Materia("Programación I", "PR1", 6, 8.0f));
        e1.agregarMateria(new Materia("Matemática I", "MAT1", 6, 7.0f));

        e2.agregarMateria(new Materia("Anatomía", "MED1", 8, 6.0f));
        e2.agregarMateria(new Materia("Biología", "MED2", 6, 5.0f));

        e3.agregarMateria(new Materia("Introducción al Derecho", "DER1", 6, 9.0f));

        // Recalcular promedios
        e1.calcularPromedio();
        e2.calcularPromedio();
        e3.calcularPromedio();

        // Agregar estudiantes a la carrera y listarlos
        carreraSistemas.agregarEstudiante(e1);
        carreraSistemas.agregarEstudiante(e2);
        carreraSistemas.agregarEstudiante(e3);

        System.out.println("Promedios:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("\nEstudiantes de la carrera " + carreraSistemas.getNombre() + ":");
        carreraSistemas.listarEstudiantes();

        // Búsqueda
        System.out.println("\nBuscando 'Ana'...");
        Estudiante buscado = carreraSistemas.buscarEstudiante("Ana");
        System.out.println(buscado != null ? "Encontrado: " + buscado : "No encontrado.");
    }
}
