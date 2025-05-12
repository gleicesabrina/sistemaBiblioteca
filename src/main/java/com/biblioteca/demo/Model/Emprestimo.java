package com.biblioteca.demo.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Exemplar exemplar; // Relacionamento com Exemplar

    @ManyToOne
    private Secretaria secretaria; // Quem registrou o empréstimo

    @ManyToOne
    private Funcionario funcionario; // Quem pesquisou o exemplar (não necessariamente precisa estar no empréstimo, mas podemos registrar)

    private String dataEmprestimo;
    private String dataDevolucao;


}


