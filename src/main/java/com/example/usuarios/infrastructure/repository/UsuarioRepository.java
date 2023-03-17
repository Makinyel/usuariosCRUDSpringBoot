package com.example.usuarios.infrastructure.repository;

import com.example.usuarios.infrastructure.dto.UsuarioDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioDto, String> {
}
