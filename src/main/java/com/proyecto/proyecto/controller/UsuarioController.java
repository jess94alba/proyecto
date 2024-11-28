package com.proyecto.proyecto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.proyecto.proyecto.models.Usuario;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>(
        Arrays.asList(new Usuario(1234, "jess", "alba"))
    );

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        
        return usuarios;
    }

    @GetMapping("usuario/{nombre}")
    public Usuario getUsuario(@PathVariable String nombre) {
        for (Usuario c : usuarios){
            if (c.getNombre().equalsIgnoreCase(nombre)){

                return c;
            }
        }
        return null;
    }

    @PostMapping("usuario")
    public Usuario postUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);   

        return usuario;
    }

    @PutMapping("usuario")
    public Usuario putUsuario(@RequestBody Usuario usuario) {
        for( Usuario c : usuarios){
            if(c.getIdCli().equals(usuario.getIdCli())) {
                c.setNombre(usuario.getNombre());
                c.setApellido(usuario.getApellido());

                return c;
            }
        } 

        return null;
    }

    @DeleteMapping("usuario/{idCli}")
    public Usuario deleteUsuario (@PathVariable int idCli){
        for(Usuario c : usuarios){
            if (c.getIdCli() == idCli){
                usuarios.remove(c);

                return c;
            }
        }

        return null;
    }
}
