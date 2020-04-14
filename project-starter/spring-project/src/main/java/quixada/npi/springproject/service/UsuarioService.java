package quixada.npi.springproject.service;


import quixada.npi.springproject.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario findByEmail(String email);

    List<Usuario> findAll();

    void newUser(Usuario ususario);

    Usuario save(Usuario usuario);
}
