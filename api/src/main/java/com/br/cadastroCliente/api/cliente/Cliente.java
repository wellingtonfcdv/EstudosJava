package com.br.cadastroCliente.api.cliente;

import com.br.cadastroCliente.api.endereco.Endereco;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;

@Table(name="clientes")
@Entity(name ="Cliente")
//@JsonInclude(JsonInclude.Include.NON_NULL)//propriedade para ocultar o campo com valor null no retorno da api

//Lombok
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private LocalDate data_nascimento;
    private String email;
    private String telefone;
    private String celular;
    private Boolean ativo;

    @Embedded
    private Endereco endereco;

    public Cliente(DadosCadastroCliente cliente) {
        this.ativo = true;
        this.nome = cliente.nome();
        this.cpf = cliente.cpf();
        this.rg = cliente.rg();
        this.data_nascimento = cliente.data_nascimento().toLocalDate();
        this.email = cliente.email();
        this.telefone = cliente.telefone();
        this.celular = cliente.celular();
        this.endereco = new Endereco(cliente.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoCliente dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.email() != null){
            this.email = dados.email();
        }
        if(dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }



    }

    //exclusão lógica.
    public void excluir() {
        this.ativo = false;
    }

    public void ativar() {
        this.ativo = true;
    }
}
