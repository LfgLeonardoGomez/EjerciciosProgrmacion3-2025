import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class main {
    public static void main(String[] args) {
    Producto p1=new Producto(1,"Leche",1800);
    Producto p2=new Producto(2,"Azucar",1200);
    Producto p3=new Producto(3,"Yerba",2500);
    Producto p4=new Producto(4,"Cafe",4500);
    Producto p5=new Producto(5,"Te",2100);
    Producto p6=new Producto(3,"Arroz",1350);
    Producto p7=new Producto(6,"leche",1800);
    Producto p8=new Producto(6,"Cafe",4500);
    Producto[] array={p1, p2, p3, p4, p5, p6, p7,p8};
    List<Producto> lista=new ArrayList<>();
    HashSet<Producto> set=new HashSet<>();

    for(Producto p:array){
        if(!lista.contains(p)) lista.add(p);
    }
    System.out.println("Lista de productos sin duplicados:(con contains)");
    for(Producto p:lista){
        System.out.println(p);
    }

System.out.println();
System.out.println("---------------------------------------------------");
System.out.println();

    for(Producto p:set){
        set.add(p);
    }
     System.out.println("Lista de productos sin duplicados:(con HashSet)");
    for(Producto p:lista){
        System.out.println(p);
    }
}
}
