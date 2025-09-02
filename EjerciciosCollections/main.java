
import java.util.ArrayList;
public class main {
public static void main(String[] args) {
    Alumno juan = new Alumno("Juan", 8.5);
    Alumno maria = new Alumno("Maria", 9.0);
    Alumno pedro = new Alumno("Pedro", 7.5);
    Alumno ana = new Alumno("Ana", 9.5);
    Alumno leo = new Alumno("Leo", 6.0);
    Alumno lucia = new Alumno("Lucia", 8.0);

    Alumno[] alumnos = {juan, maria, pedro, ana, leo, lucia};
    
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    for (Alumno alumno : alumnos) {
        listaAlumnos.add(alumno);
    }

    for (Alumno alumno : listaAlumnos) {
        System.out.println(alumno);
    }
}
}