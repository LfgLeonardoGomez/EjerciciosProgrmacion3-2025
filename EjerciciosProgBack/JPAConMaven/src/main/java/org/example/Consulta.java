package org.example;

import java.time.LocalDate;
@Entity
@Data
public class Consulta extends Base{

    private LocalDate fecha;
    private String diagnostico;
}
