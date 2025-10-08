package com.example.entity.dto.mapper;

import com.example.entity.Foto;
import com.example.entity.dto.foto.FotoCreate;

public class FotoMapper {
public static Foto toEntity(FotoCreate fotoCreate) {
    Foto foto = new Foto();
    foto.setNombre(fotoCreate.nombre());
    foto.setUrl(fotoCreate.url());
    return foto;
}
}
