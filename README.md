# Trabajo Práctico – Programación Orientada a Objetos (Java)

## Clases implementadas

- `Estudiante`
- `Materia`
- `Carrera`
- `App` (con el método `main` que demuestra las relaciones)

---

## Encapsulamiento

Los atributos de cada clase se declararon como **privados**.  
El acceso y modificación se hace mediante **getters y setters**, lo que permite controlar y validar los valores antes de asignarlos.

---

## Relaciones entre clases

- **Estudiante – Materia**:  
  Cada estudiante tiene un arreglo de materias.

  - `agregarMateria(Materia m)` agrega una nueva materia.
  - `calcularPromedio()` calcula el promedio de calificaciones de todas sus materias.

- **Carrera – Estudiante**:  
  Cada carrera tiene un arreglo de estudiantes.

  - `agregarEstudiante(Estudiante e)` agrega un estudiante a la carrera.
  - `listarEstudiantes()` muestra todos los estudiantes.
  - `buscarEstudiante(String nombre)` busca un estudiante por su nombre.

- En `App.main`:  
  Se crean seis estudiantes, se les asignan materias, se calculan promedios y se agregan a una carrera para listarlos y buscar uno por nombre.

---

## Validaciones en setters

- **Estudiante**

  - `setNombre` y `setApellido`: no permiten valores vacíos.
  - `setEdad`: debe ser mayor a 16.
  - `setPromedio`: debe estar entre 0 y 10.

- **Materia**
  - `setCreditos`: mayor a 0.
  - `setCalificacion`: entre 0 y 10.

---

## Ejecución

El proyecto se desarrolló y probó en **Visual Studio Code**, usando la extensión de Java que permite compilar y ejecutar directamente con el botón ▶️ Run en `App.java`.  
Por eso, no fue necesario compilar manualmente con `javac`, ya que la extensión gestiona los archivos `.class` en segundo plano.

Si se desea compilar desde consola (con JDK instalado), estando en la carpeta `src` se puede hacer:

```bash
javac -encoding UTF-8 -d ../bin *.java
java -cp ../bin App
```
