package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class HistoriaClinica extends Base{

    private String descripcion;

    @OneToOne
    @JoinColumn(name = "pacienteId", referencedColumnName = "id")
    private Paciente paciente;
}
