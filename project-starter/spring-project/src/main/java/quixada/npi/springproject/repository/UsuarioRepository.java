package quixada.npi.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import quixada.npi.springproject.model.Usuario;

import java.util.List;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByEmail(String email);

    @Query("SELECT new Usuario(u.id, u.nome, u.email, u.habilitado) FROM Usuario u")
    List<Usuario> findAll();

    @Query(value = "insert into usuario(email, habilitado, nome, password) Values(:email, :habilitado, :nome, :password)", nativeQuery = true)
    void newUser(@Param("email") String email, @Param("habilitado") boolean habilitado, @Param("nome") String nome, @Param("password") String password);


}
