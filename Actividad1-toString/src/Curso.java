import java.util.HashSet;

class Curso {
private String nombre;
private HashSet<Estudiante> estudiantes= new HashSet<>();

public Curso(String nombre) {
    this.nombre = nombre;}

public String getNombre() {
    return nombre;}
public void setNombre(String nombre) {
    this.nombre = nombre;}
public HashSet<Estudiante> getEstudiantes() {
    return estudiantes;}
public void setEstudiantes(HashSet<Estudiante> estudiantes) {
    this.estudiantes = estudiantes;}
public void agregarEstudiante(Estudiante estudiante) {
    estudiantes.add(estudiante);}

public String mostrarEstudiantes() {
    String retorno="Estudiantes en el curso: \n";
    
    for (Estudiante es : estudiantes) {
        //System.out.println(es);
        retorno += es + "\n";
    }
    return retorno;
}
@Override
public String toString() {
    String salida= "Curso:" + nombre + ", Estudiantes=" + estudiantes.size() + "\n"+ mostrarEstudiantes();
    return salida;
}

}

