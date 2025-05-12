package com.biblioteca.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public abstract class Funcionario {
    
@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionario_generator")
    @Column(name = "matricula")
    private Long matricula;

    @Column(length = 150, nullable = false)
    private String nome;


    public void pesquisaLivros(){


        System.out.println("Pesquisando livros");
    }

}
