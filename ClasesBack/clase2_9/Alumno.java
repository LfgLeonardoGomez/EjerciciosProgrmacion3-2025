package clase2_9;

public class Alumno {
    private String nombre, curso;
    private double nota;

    public Alumno(String nombre, double nota, String curso){
        this.nombre = nombre;
        this.nota = nota;
        this.curso = curso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", curso=" + curso + ", nota=" + nota + "]";
    }

}
