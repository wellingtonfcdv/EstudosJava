package com.br.cadastroCliente.api.cliente;

import com.br.cadastroCliente.api.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.sql.Date;

public record DadosCadastroCliente(
        @NotBlank String nome,
        @NotBlank String cpf,
        String rg,
        Date data_nascimento,
        @Email String email,
        @NotBlank String telefone,
        @NotBlank
                @Pattern (regexp = "^[1-9]{2}9[0-9]{8}$")
        String celular,
        @NotNull
                @Valid
        DadosEndereco endereco) {
}
