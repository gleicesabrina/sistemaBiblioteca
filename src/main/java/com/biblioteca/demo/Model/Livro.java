package com.biblioteca.demo.Model;

import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Livro {
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "livro_generator")
    private Long id;

    @Column(length = 150, nullable = false)
    private String nome;

    @Column(length = 150, nullable = false)
    private String editora;

    @Column(length = 150, nullable = false)
    private String areaAdvocacia;


    @OneToMany(mappedBy = "livro")
    private Set <Exemplar> exemplares = new HashSet<>();
}