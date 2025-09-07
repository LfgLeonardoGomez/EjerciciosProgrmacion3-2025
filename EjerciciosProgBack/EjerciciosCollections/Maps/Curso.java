package Maps;

public class Curso {

    private String nombre;
    private String docente;

    public Curso(String nombre, String docente) {
        this.nombre = nombre;
        this.docente = docente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocente() {
        return docente;
    }
    public void setDocente(String docente) {
        this.docente = docente;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", docente='" + docente + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Curso curso = (Curso)obj;
        return nombre == curso.nombre;
    }
    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
    
}
