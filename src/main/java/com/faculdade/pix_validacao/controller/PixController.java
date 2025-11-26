package com.faculdade.pix_validacao.controller;

import com.faculdade.pix_validacao.model.Usuario;
import com.faculdade.pix_validacao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*; // Importante

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Permite o acesso do HTML
public class PixController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/validar/{cpf}")
    public Map<String, Object> validarUsuario(@PathVariable String cpf) {
        System.out.println("Recebi uma requisição para o CPF: " + cpf); // Log para ver no console

        Optional<Usuario> userOpt = repository.findByCpf(cpf);

        if (userOpt.isEmpty()) {
            System.out.println("CPF não encontrado no banco.");
            return Map.of("status", "NAO_ENCONTRADO");
        }

        Usuario usuario = userOpt.get();

        // Verifica se tem documento e se está validado com segurança contra Null
        boolean cnhOk = false;
        if (usuario.getDocumento() != null) {
            cnhOk = usuario.getDocumento().isValidado();
        }

        System.out.println("Usuário encontrado: " + usuario.getNome() + " | CNH OK? " + cnhOk);

        if (cnhOk) {
            return Map.of(
                    "status", "APROVADO",
                    "nome", usuario.getNome()
            );
        } else {
            return Map.of(
                    "status", "BLOQUEADO",
                    "motivo", "CNH não validada"
            );
        }
    }
}