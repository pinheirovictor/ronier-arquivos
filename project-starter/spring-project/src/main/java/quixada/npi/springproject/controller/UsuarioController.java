package quixada.npi.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import quixada.npi.springproject.model.Usuario;
import quixada.npi.springproject.service.UsuarioService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("")
    public ResponseEntity<List<Usuario>> findAll() {
        System.out.println("1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 - ");
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<List<Usuario>> find(@PathVariable Integer id) {
        // Busca usuário pelo id e retornar usuário...

        return ResponseEntity.ok().build();
    }

    @PostMapping("/")
    public ResponseEntity create(@Valid @RequestBody Usuario usuario) {
        System.out.println("==========================================================================================================");
        return ResponseEntity.ok(usuarioService.save(usuario));
    }

    //@DeleteMapping("{id}")
    //TODO: excluir usuário

    // @PutMapping("{id}")
    /*public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {

    }*/



}
