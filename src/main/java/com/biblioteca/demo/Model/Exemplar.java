package com.biblioteca.demo.Model;

import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Exemplar {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exemplar_generator")
    private Long numSequencia;

    @Temporal(TemporalType.DATE)
    private Date dataAquisicao;

    @Column(columnDefinition = "DECIMAL(10,2)", nullable = false)
    private Double precoPago;

    @Column(nullable = false)
    private Boolean disponibilidade = true;

    @ManyToOne
    @JoinColumn(name = "id_livro") // nome da coluna FK no banco
    private Livro livro;

}