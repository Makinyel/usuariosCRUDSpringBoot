package com.example.usuarios.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity

public class UsuarioDto {

    private String nombre;
    private String apellido;
    @Id
    private String numDocumento;
    private String tipoDocumento;

    public UsuarioDto(String nombre, String apellido, String numDocumento, String tipoDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDocumento = numDocumento;
        this.tipoDocumento = tipoDocumento;
    }
}
