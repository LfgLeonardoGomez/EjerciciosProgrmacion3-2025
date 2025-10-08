package com.example.entity;

import java.lang.module.ModuleDescriptor.Builder;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Dni extends Base{

    private String nombre;
    private int numero;

    //@Builder.Default
    private String fechaCreacion = LocalDate.now().toString();
    private String fechaVencimiento;
    @OneToOne(cascade = CascadeType.ALL)
    private Foto foto;

}
