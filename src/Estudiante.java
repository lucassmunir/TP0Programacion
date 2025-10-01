public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private float promedio;   
    private Materia[] materias;  

    public Estudiante() {
        this.materias = new Materia[0];
    }

    public Estudiante(String nombre, String apellido, int edad, String carrera, float promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = new Materia[0];
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) this.nombre = nombre;
        else System.out.println("Nombre no válido.");
    }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) this.apellido = apellido;
        else System.out.println("Apellido no válido.");
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad > 16) this.edad = edad;
        else System.out.println("Edad no válida (debe ser > 16).");
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public float getPromedio() { return promedio; }
    public void setPromedio(float promedio) {
        if (promedio >= 0 && promedio <= 10) this.promedio = promedio;
        else System.out.println("Promedio debe estar entre 0 y 10.");
    }

    public Materia[] getMaterias() { return materias; }

    // Agregar materia “agrandando” el array
    public void agregarMateria(Materia materia) {
        if (materia == null) {
            System.out.println("La materia no puede ser nula.");
            return;
        }
        Materia[] nuevo = new Materia[materias.length + 1];
        for (int i = 0; i < materias.length; i++) nuevo[i] = materias[i];
        nuevo[materias.length] = materia;
        materias = nuevo;
    }

    // Recalcula el promedio según las calificaciones de las materias
    public float calcularPromedio() {
        if (materias.length == 0) {
            this.promedio = 0f;
            return 0f;
        }
        float suma = 0f;
        for (Materia m : materias) {
            suma += m.getCalificacion();
        }
        this.promedio = suma / materias.length;
        return this.promedio;
    }

    public String toString() {
        return nombre + " " + apellido + " (" + carrera + ") - Promedio: " + promedio;
    }
}
