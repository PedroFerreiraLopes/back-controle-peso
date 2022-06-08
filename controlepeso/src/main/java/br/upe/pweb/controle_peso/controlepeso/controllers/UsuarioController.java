package br.upe.pweb.controle_peso.controlepeso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.upe.pweb.controle_peso.controlepeso.models.Usuario;
import br.upe.pweb.controle_peso.controlepeso.services.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/usuarios")
    // usuarioService.
    
}
