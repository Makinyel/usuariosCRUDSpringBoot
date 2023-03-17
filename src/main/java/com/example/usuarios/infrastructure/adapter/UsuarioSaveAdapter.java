package com.example.usuarios.infrastructure.adapter;

import com.example.usuarios.domain.entities.Usuario;
import com.example.usuarios.domain.service.UsuarioSaveService;
import com.example.usuarios.infrastructure.mapper.UsuarioMapper;
import com.example.usuarios.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioSaveAdapter implements UsuarioSaveService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    @Override
    public Usuario saveUser(Usuario usuario) {
        return usuarioMapper.usuario(usuarioRepository.save(usuarioMapper.usuarioDto(usuario)));
    }
}
