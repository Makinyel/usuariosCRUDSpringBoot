package com.example.usuarios.infrastructure.adapter;

import com.example.usuarios.domain.entities.Usuario;
import com.example.usuarios.domain.service.UsuarioGetService;
import com.example.usuarios.infrastructure.dto.UsuarioDto;
import com.example.usuarios.infrastructure.mapper.UsuarioMapper;
import com.example.usuarios.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UsuarioGetAdapter implements UsuarioGetService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    @Override
    public Usuario getUsuario(String id) {
        Optional<UsuarioDto> userDto = usuarioRepository.findById(id);
        return userDto.map(usuarioMapper::usuario).orElse(null);
    }
}