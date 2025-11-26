package com.faculdade.pix_validacao.repository;

import com.faculdade.pix_validacao.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // O Spring cria o SQL automaticamente só pelo nome do método
    Optional<Usuario> findByCpf(String cpf);
}