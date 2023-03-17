package com.example.usuarios.application;

import com.example.usuarios.domain.entities.Usuario;
import com.example.usuarios.domain.service.UsuarioGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioGet {

    private final UsuarioGetService usuarioGetService;

    public Usuario getUsuario(String id) {
        return usuarioGetService.getUsuario(id);
    }




}
