package clase2_9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        Alumno alumno1 = new Alumno("Juan", 7.5, "2A");
        Alumno alumno2 = new Alumno("Ana", 8.0, "2B");
        Alumno alumno3 = new Alumno("Luis", 6.0, "2A");
        Alumno alumno4 = new Alumno("Maria", 9.0, "2C");
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1); 
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        
        System.out.println("Alumnos con nota >= 7.0, ordenados por nombre en mayusculas:");
        
        alumnos.stream()
            .filter( a -> a.getNota() >= 7.0 )
            .sorted(Comparator.comparing(Alumno::getNombre))
            .map( a -> a.getNombre().toUpperCase() )
            .forEach(a -> System.out.println(a));

        System.out.println("-----");

        System.out.println("Promedio de notas de todos los alumnos:");
        double promedio = alumnos.stream()
            .collect(Collectors.averagingDouble(Alumno::getNota));

        System.out.println("Promedio general: " + promedio);

        System.out.println("-----");

        System.out.println("Alumnos agrupados por curso:");
        alumnos.stream()
            .collect(Collectors.groupingBy(Alumno::getCurso))
            .forEach ((curso, lista) ->{
                System.out.println("Curso: " + curso);
                lista.forEach(a -> System.out.println(" - " + a.getNombre() + ": " + a.getNota()));
            });

        System.out.println("-----");

        System.out.println("Top 3 alumnos con mejores notas:");
        alumnos.stream()
            .sorted(Comparator.comparing(Alumno::getNota).reversed())
            .limit(3)
            .forEach(a -> System.out.println(a.getNombre() + ": " + a.getNota()));
            

        
    }
}
