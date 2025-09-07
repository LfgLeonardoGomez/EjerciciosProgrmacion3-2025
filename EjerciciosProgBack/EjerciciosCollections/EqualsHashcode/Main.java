package EqualsHashcode;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
      
        Producto p1 = new Producto(1, "Coca Cola");
        Producto p2 = new Producto(2, "Fanta");
        Producto p3 = new Producto(3, "Sprite");
        Producto p4 = new Producto(1, "Coca Cola Zero");
        Producto p5 = new Producto(4, "Fanta Zero");
        Producto p6 = new Producto(5, "Coca Cola");
        Producto[] productos = {p1, p2, p3, p4, p5, p6};

        HashSet<Producto> set = new HashSet<>();

        for (Producto p: productos) {
            set.add(p);
        }

        for (Producto p: set) {
            System.out.println(p);
        }
    
// EJECUTAR DESDE MAIN.JAVA CON RUN JAVA, NO RUN CODE

    }
}
