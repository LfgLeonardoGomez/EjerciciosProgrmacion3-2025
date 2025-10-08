package com.example.entity.dto.dni;

import com.example.entity.dto.foto.FotoCreate;

public record DniCreate (
    String nombre,
    int numero,
    String fechaVencimiento,
    FotoCreate foto
){

}
