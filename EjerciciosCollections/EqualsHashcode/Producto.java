package EqualsHashcode;

public class Producto {
    private long codigo;
    private String descripcion;

    public Producto(long codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return codigo == producto.codigo;
    }
    @Override
    public int hashCode() {
        return Long.hashCode(codigo);
    }

}