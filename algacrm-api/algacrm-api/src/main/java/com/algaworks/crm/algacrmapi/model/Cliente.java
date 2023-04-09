package com.algaworks.crm.algacrmapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

//Entity - Entidade JPA - tabela para o banco de dados
//ID - Entidade JPA - Chave primaria
//GeneratedValue - Incremento do Id
//Data - Adiciona hashcode, equals, etc, automaticamente.
@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) //not null
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
