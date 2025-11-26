package com.faculdade.pix_validacao.controller;

import com.faculdade.pix_validacao.model.*;
import com.faculdade.pix_validacao.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired private UsuarioRepository usuarioRepo;
    @Autowired private DocumentoRepository documentoRepo;
    @Autowired private CarteiraRepository carteiraRepo;
    @Autowired private EnderecoRepository enderecoRepo;
    @Autowired private TransacaoRepository transacaoRepo;

    // ================= USUARIO CRUD =================
    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios() { return usuarioRepo.findAll(); }

    @PostMapping("/usuarios")
    public Usuario criarUsuario(@RequestBody Usuario usuario) { return usuarioRepo.save(usuario); }

    @DeleteMapping("/usuarios/{id}")
    public void deletarUsuario(@PathVariable Long id) { usuarioRepo.deleteById(id); }

    // ================= DOCUMENTO CRUD =================
    @GetMapping("/documentos")
    public List<Documento> listarDocumentos() { return documentoRepo.findAll(); }

    @PostMapping("/documentos")
    public Documento criarDocumento(@RequestBody Documento doc) { return documentoRepo.save(doc); }

    // ================= CARTEIRA CRUD =================
    @GetMapping("/carteiras")
    public List<Carteira> listarCarteiras() { return carteiraRepo.findAll(); }

    @PostMapping("/carteiras")
    public Carteira criarCarteira(@RequestBody Carteira carteira) { return carteiraRepo.save(carteira); }

    // ================= ENDERECO CRUD =================
    @GetMapping("/enderecos")
    public List<Endereco> listarEnderecos() { return enderecoRepo.findAll(); }

    @PostMapping("/enderecos")
    public Endereco criarEndereco(@RequestBody Endereco endereco) { return enderecoRepo.save(endereco); }

    // ================= TRANSACAO CRUD =================
    // Esse é importante para o tema "Pix"
    @GetMapping("/transacoes")
    public List<Transacao> listarTransacoes() { return transacaoRepo.findAll(); }

    @PostMapping("/transacoes")
    public Transacao criarTransacao(@RequestBody Transacao transacao) { return transacaoRepo.save(transacao); }
}