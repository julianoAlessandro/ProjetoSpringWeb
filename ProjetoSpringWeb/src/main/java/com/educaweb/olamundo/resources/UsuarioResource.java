package com.educaweb.olamundo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educaweb.olamundo.entidades.Usuarios;

@RestController
@RequestMapping(value = "/Usuarios")
public class UsuarioResource {

    @GetMapping
    public ResponseEntity<Usuarios> findAll() {
        Usuarios u = new Usuarios(1, "juliano", "juliano@gmail.com", "11111", "123");
        return ResponseEntity.ok().body(u);

    }
}
