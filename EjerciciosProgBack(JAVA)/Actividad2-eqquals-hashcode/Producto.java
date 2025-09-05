public class Producto {
private String nombre;
private double precio;
private int codigo;
public Producto(int codigo, String nombre, double precio ) {
    this.nombre = nombre;
    this.precio = precio;
    this.codigo = codigo;}
public String getNombre() {
    return nombre;
}
public double getPrecio() {
    return precio;
}
public int getCodigo() {
    return codigo;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
public void setCodigo(int codigo) {
    this.codigo = codigo;
}
@Override
public String toString() {
    return "Producto= " + nombre + ", precio=" + precio + ", codigo=" + codigo + "]";
}
@Override
public boolean equals(Object obj){
    if(this == obj) return true;
    if(!(obj instanceof Producto)) return false;
    return this.codigo == ((Producto) obj).codigo;
}
@Override
public int hashCode() {
    return Integer.hashCode(codigo);
}
}
