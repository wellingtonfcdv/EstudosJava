package com.br.cadastroCliente.api.cliente;

import com.br.cadastroCliente.api.endereco.Endereco;
// listagem das informações que serão exibidas no retorno da api
public record DadosListagemCliente(Long id, Boolean ativo,String nome, String email,String telefone, Endereco endereco) {

    public DadosListagemCliente(Cliente cliente){
        this(cliente.getId(), cliente.getAtivo(),cliente.getNome(),cliente.getEmail(),cliente.getTelefone(),cliente.getEndereco());
    }
}
