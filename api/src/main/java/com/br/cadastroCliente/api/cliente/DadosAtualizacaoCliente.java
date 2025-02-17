package com.br.cadastroCliente.api.cliente;

import com.br.cadastroCliente.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(

        @NotNull
        Long id,
        String nome,
        String telefone,
        String email,
        String ativo,
        DadosEndereco endereco) {

}
