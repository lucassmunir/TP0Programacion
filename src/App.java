public class App {
    public static void main(String[] args)  {

        Estudiante estudiante1 = new Estudiante();
            estudiante1.nombre = "Ana";
            estudiante1.apellido = "Pérez";
            estudiante1.edad = 20;
            estudiante1.carrera = "Ingeniería";
            estudiante1.promedio = 4.5f;

       Estudiante estudiante2 = new Estudiante();
           estudiante2.nombre = "Luis";
           estudiante2.apellido = "Gómez";
           estudiante2.edad = 22;
           estudiante2.carrera = "Medicina";
           estudiante2.promedio = 3.8f; 

       Estudiante estudiante3 = new Estudiante();
        estudiante3.nombre = "María";
        estudiante3.apellido = "López";
        estudiante3.edad = 19;
        estudiante3.carrera = "Derecho";
        estudiante3.promedio = 4.0f;

       Estudiante estudiante4 = new Estudiante("Carlos", "Ramírez", 21, "Arquitectura", 4.2f);

       Estudiante estudiante5 = new Estudiante("Sofía", "Fernández", 23, "Psicología", 3.9f);

       Estudiante estudiante6 = new Estudiante("Miguel", "Torres", 20, "Economía", 4.1f);

        System.out.println("Estudiante 4: " + estudiante4.nombre + " " + estudiante4.apellido + ", Edad: " + estudiante4.edad + ", Carrera: " + estudiante4.carrera + ", Promedio: " + estudiante4.promedio);
        System.out.println("Estudiante 5: " + estudiante5.nombre + " " + estudiante5.apellido + ", Edad: " + estudiante5.edad + ", Carrera: " + estudiante5.carrera + ", Promedio: " + estudiante5.promedio);
        System.out.println("Estudiante 6: " + estudiante6.nombre + " " + estudiante6.apellido + ", Edad: " + estudiante6.edad + ", Carrera: " + estudiante6.carrera + ", Promedio: " + estudiante6.promedio);

    }
}
