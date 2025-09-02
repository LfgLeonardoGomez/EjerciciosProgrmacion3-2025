package Maps;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso ("Java", "Juan Perez");
        Curso curso2 = new Curso ("Estadistica", "Maria Gomez");
        Curso curso3 = new Curso ("Base de datos", "Carlos Sanchez");
        Curso curso4 = new Curso ("Metodologia", "Ana Torres");

        HashMap<String, Curso> cursos = new HashMap<>();
        cursos.put("0001", curso1);
        cursos.put("0002", curso2);
        cursos.put("0003", curso3);
        cursos.put("0004", curso4);
        cursos.put("0002", curso4); // Llave repetida, reemplaza el valor anterior
        cursos.put("0005", curso1); 
        System.out.println("Curso Buscado: "+cursos.get("0002"));
        cursos.entrySet().forEach(entry -> {
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue());
        }); 

        for (HashMap.Entry<String, Curso> entry : cursos.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue());
        }
    }
}
