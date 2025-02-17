package com.br.cadastroCliente.api.controller;

import com.br.cadastroCliente.api.cliente.*;
import com.br.cadastroCliente.api.cliente.DadosAtualizacaoCliente;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesRepository repository;
    private com.br.cadastroCliente.api.cliente.Cliente Cliente;

    @PostMapping
    @Transactional
    public void cadastrar(@Valid @RequestBody DadosCadastroCliente cliente){
        repository.save(new Cliente(cliente));
    }

    @GetMapping
    public Page<DadosListagemCliente> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemCliente::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoCliente dados){
        var cliente = repository.getReferenceById(dados.id());
        cliente.atualizarInformacoes(dados);
//        if (!cliente.getAtivo()){
//            cliente.ativar();
//        }

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteCliente(@PathVariable Long id){
        var cliente = repository.getReferenceById(id);
        cliente.excluir();
    }


}
