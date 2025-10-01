public class Carrera {
    private String nombre;
    private Estudiante[] estudiantes;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[0];
    }

    public String getNombre() { return nombre; }

    public void agregarEstudiante(Estudiante e) {
        if (e == null) return;
        Estudiante[] nuevo = new Estudiante[estudiantes.length + 1];
        for (int i = 0; i < estudiantes.length; i++) nuevo[i] = estudiantes[i];
        nuevo[estudiantes.length] = e;
        estudiantes = nuevo;
    }

    public void listarEstudiantes() {
        if (estudiantes.length == 0) {
            System.out.println("No hay estudiantes en la carrera.");
            return;
        }
        for (Estudiante e : estudiantes) System.out.println("- " + e);
    }

    public Estudiante buscarEstudiante(String nombre) {
        for (Estudiante e : estudiantes) {
            if (e.getNombre() != null && e.getNombre().equalsIgnoreCase(nombre)) return e;
        }
        return null;
    }

    public Estudiante[] getEstudiantes() { return estudiantes; }
}
