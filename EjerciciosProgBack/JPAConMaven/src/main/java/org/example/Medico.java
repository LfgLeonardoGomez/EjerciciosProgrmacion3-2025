package org.example;
@Data
@Entity
public class Medico extends Base{

    private String nombre, especialidad, matricula;
    private int edad;

    @OneToMany (cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn( name = "medicoId")
    List<Consulta> consultas = new ArrayList();
}
    