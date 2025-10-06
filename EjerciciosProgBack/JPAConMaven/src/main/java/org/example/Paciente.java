package org.example;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;


@Data
@Entity
public class Paciente extends Base{

    private String nombre, apellido, obraSocial;
    private int edad, dni;
    private LocalDate fechaNacimiento;
    private char sexo;
    
    @ManyToMany
    @JoinTable(name = "pacienteMedicamento",
            joinColumns = @JoinColumn(name = "pacienteId"),
            inverseJoinColumns = @JoinColumn(name = "medicamentoId"))
    private List<Medicamento> medicamentos;

    @OneToMany
    @JoinColumn(name = "pacienteId")
    private List<Consulta> consultas;

}
