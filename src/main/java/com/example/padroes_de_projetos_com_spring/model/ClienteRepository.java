package com.example.padroes_de_projetos_com_spring.model;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository  extends CrudRepository<Cliente, Long> {
}
