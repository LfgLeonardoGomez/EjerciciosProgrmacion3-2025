import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persona p1= new Persona("Juan",25);
        Persona p2= new Persona("Maria",20);
        Persona p3= new Persona("Matias",18);
        Persona p4= new Persona("Ezequiel",21);
        Estudiante e1= new Estudiante("Pedro",35,"Medicina");
        Estudiante e2= new Estudiante("Mariana",30,"Programacion");
        Estudiante e3= new Estudiante("Carlos",28,"Arquitectura");
        Estudiante e4= new Estudiante("Lucia",22,"Derecho");
        Estudiante e5= new Estudiante("Ana",26,"Ingenieria");
        Estudiante e6= new Estudiante("Luis",24,"Biologia");
        List<Persona> lista=new ArrayList<>();
        HashSet<Estudiante> estudiantes=new HashSet<>();
        HashSet<Estudiante> estudiantes2=new HashSet<>();
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        estudiantes2.add(e4);
        estudiantes2.add(e5);
        estudiantes2.add(e6);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        /*for(Persona p:lista) {
            System.out.println(p);
        }*/ 

        Curso curso1= new Curso("Programacion");
        Curso curso2= new Curso("Base de datos");
        Curso curso3= new Curso("Ingles");
        curso1.setEstudiantes(estudiantes);
        curso2.setEstudiantes(estudiantes2);
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        


    }
}