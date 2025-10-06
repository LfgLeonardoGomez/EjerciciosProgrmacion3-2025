package org.example;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

import lombok.Data;


@Data
@MappedSuperclass
public abstract class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Builder.Default
    private Boolean eliminado = false;
    

    public void eliminar() {
        this.eliminado = true;
    }

   
}
