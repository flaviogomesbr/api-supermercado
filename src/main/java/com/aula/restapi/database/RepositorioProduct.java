package com.aula.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.restapi.entidade.Produto;

public interface RepositorioProduct extends JpaRepository<Produto,Long>{
    
}
