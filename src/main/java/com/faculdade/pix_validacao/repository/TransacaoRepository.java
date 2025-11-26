package com.faculdade.pix_validacao.repository;
import com.faculdade.pix_validacao.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {}