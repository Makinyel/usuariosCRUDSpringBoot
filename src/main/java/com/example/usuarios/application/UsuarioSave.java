package com.example.usuarios.application;

import com.example.usuarios.domain.entities.Usuario;
import com.example.usuarios.domain.service.UsuarioSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioSave {

    private final UsuarioSaveService usuarioSaveService;
    public Usuario saveUser(Usuario usuario){
       return usuarioSaveService.saveUser(usuario);
    }
}
