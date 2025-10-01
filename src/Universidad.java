public class Universidad {
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;

    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = new Estudiante[0];
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public Estudiante[] getEstudiantes() { return estudiantes; }

    public void agregarEstudiante(Estudiante e) {
        if (e == null) {
            System.out.println("El estudiante no puede ser nulo.");
            return;
        }
        Estudiante[] nuevo = new Estudiante[estudiantes.length + 1];
        for (int i = 0; i < estudiantes.length; i++) nuevo[i] = estudiantes[i];
        nuevo[estudiantes.length] = e;
        estudiantes = nuevo;
    }
}
