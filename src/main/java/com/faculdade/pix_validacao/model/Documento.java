package com.faculdade.pix_validacao.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo; // "CNH" ou "RG"
    private String numero;
    private boolean validado; // TRUE = Aprovado, FALSE = Bloqueado
}