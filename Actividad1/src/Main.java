import java.util.ArrayList;
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
        List<Persona> lista=new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        for(Persona p:lista) {
            System.out.println(p);
        }
    }
}