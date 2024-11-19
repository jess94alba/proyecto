package com.proyecto.proyecto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>(
        Arrays.asList(new Usuario(1234, "jess", "alba"))
    );

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    @PostMapping("/usuario")
    public Usuario postUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        
        return usuario;
    }
    
    
}
