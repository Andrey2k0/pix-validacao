package com.faculdade.pix_validacao.repository;
import com.faculdade.pix_validacao.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DocumentoRepository extends JpaRepository<Documento, Long> {}