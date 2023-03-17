package com.example.usuarios.infrastructure.api.controller;


import com.example.usuarios.application.UsuarioGet;
import com.example.usuarios.application.UsuarioSave;
import com.example.usuarios.domain.entities.Usuario;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path ="/usuario")
public class UsuarioController {

    private final UsuarioSave usuarioSave;
    private final UsuarioGet usuarioGet;

    @PostMapping
    public ResponseEntity<Usuario> saveUser(@RequestBody Usuario user) {
        return new ResponseEntity<>(usuarioSave.saveUser(user), HttpStatus.CREATED);

    }
    @GetMapping("/{numdocumento}")
    public ResponseEntity<Usuario> getUser(@PathVariable String numdocumento) {
        System.out.println(numdocumento);
       return ResponseEntity.ok(usuarioGet.getUsuario(numdocumento));
    }


}
