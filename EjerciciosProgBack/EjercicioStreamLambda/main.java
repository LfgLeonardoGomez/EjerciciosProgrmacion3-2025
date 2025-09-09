package EjerciciosProgBack.EjercicioStreamLambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
     
    Producto p1 = new Producto("Camisa", "Ropa", 25.99, 10);
    Producto p2 = new Producto("Pantalones", "Ropa", 45.50, 5);
    Producto p3 = new Producto("Zapatos", "Calzado", 60.00, 8);
    Producto p4 = new Producto("Sombrero", "Accesorios", 15.75, 20);
    Producto p5 = new Producto("Bufanda", "Accesorios", 12.30, 15);
    Producto p6 = new Producto("Cinturón", "Accesorios", 18.40, 7);
    Producto p7 = new Producto("Chaqueta", "Ropa", 80.00, 3);
    Producto p8 = new Producto("Botas", "Calzado", 120.00, 4);
    Producto p9 = new Producto("Gafas de sol", "Accesorios", 50.00, 12);
    Producto p10 = new Producto("Camisa deportiva", "Ropa", 30.00, 6);
    Producto[] prod = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
    ArrayList<Producto> productos = new ArrayList<>();
    for (Producto p : prod) {
        productos.add(p);
    }
    // Listar productos con precio >100 y ordenar por precio descendente
    productos.stream()
        .filter (producto -> producto.getPrecio() > 20)
        .sorted(Comparator.comparing(Producto::getPrecio).reversed())
        .forEach(producto -> System.out.println(producto))
        ;

        System.out.println("---------------------------");
        // agrupar por categoria y sumar el stock de cada categoria
    productos.stream()
        .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.summingInt(Producto::getStock)))
        .forEach( (categoria,stock)-> System.out.println("Categoria: " +categoria + " Stock: " + stock));;
    
        System.out.println("-----------------------------");
     //generar un string con los productos(nombre y precio)
    String resultado = productos.stream()
    .map(a -> " Nombre: " + a.getNombre()+ " Precio: " + a.getPrecio() )
    .collect(Collectors.joining(";")); 
    ;
    
    System.out.println(resultado);
    }
}
