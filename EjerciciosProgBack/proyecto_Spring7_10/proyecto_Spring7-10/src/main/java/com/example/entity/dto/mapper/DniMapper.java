package com.example.entity.dto.mapper;

import com.example.entity.Dni;
import com.example.entity.Foto;
import com.example.entity.dto.dni.DniCreate;
import com.example.entity.dto.foto.FotoDto;

public class DniMapper {
public static Dni toEntity(DniCreate dnidto){
    Dni dni = new Dni();
    dni.setNombre(dnidto.nombre());
    dni.setNumero(dnidto.numero());
    dni.setFechaVencimiento(dnidto.fechaVencimiento());

    dni.setFoto(FotoMapper.toEntity(dnidto.foto()));

return dni;
}

public static FotoDto fotoDto (Foto foto){
    return new FotoDto(
        foto.getId(),
        foto.getNombre(),
        foto.getUrl()
    );
}

}
