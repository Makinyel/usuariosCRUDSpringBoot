package com.example.usuarios.infrastructure.mapper;


import com.example.usuarios.domain.entities.Usuario;
import com.example.usuarios.infrastructure.dto.UsuarioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring")
public interface UsuarioMapper {
    @Mappings({
            @Mapping(target = "nombre", source = "nombre"),
            @Mapping(target = "apellido", source = "apellido"),
            @Mapping(target = "numDocumento", source = "numDocumento"),
            @Mapping(target = "tipoDocumento", source = "tipoDocumento")})
        UsuarioDto usuarioDto(Usuario usuario);
        Usuario usuario(UsuarioDto usuarioDto);

}

