package com.br.cadastroCliente.api.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Cliente,Long> {
}
