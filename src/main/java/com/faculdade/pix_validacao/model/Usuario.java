package com.faculdade.pix_validacao.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // O Lombok cria Getters e Setters automaticamente
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf; // Ex: 123.456.789-00

    @OneToOne(cascade = CascadeType.ALL) // Relacionamento 1 para 1
    private Documento documento;

    @OneToOne(cascade = CascadeType.ALL)
    private Carteira carteira;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
}