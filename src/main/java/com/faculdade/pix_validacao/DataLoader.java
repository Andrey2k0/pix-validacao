package com.faculdade.pix_validacao;

import com.faculdade.pix_validacao.model.*;
import com.faculdade.pix_validacao.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(UsuarioRepository repository) {
        return args -> {
            // Usuário 1: CNH Aprovada
            Usuario u1 = new Usuario();
            u1.setNome("João Silva");
            u1.setCpf("123.456.789-00");

            Documento d1 = new Documento();
            d1.setTipo("CNH");
            d1.setValidado(true); // APROVADO
            u1.setDocumento(d1);

            repository.save(u1);

            // Usuário 2: CNH Pendente/Bloqueada
            Usuario u2 = new Usuario();
            u2.setNome("Maria Souza");
            u2.setCpf("111.222.333-44");

            Documento d2 = new Documento();
            d2.setTipo("CNH");
            d2.setValidado(false); // BLOQUEADO
            u2.setDocumento(d2);

            repository.save(u2);

            System.out.println(">>> BANCO DE DADOS POPULADO COM SUCESSO! <<<");
        };
    }
}