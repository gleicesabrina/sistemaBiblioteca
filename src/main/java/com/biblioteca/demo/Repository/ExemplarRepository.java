package com.biblioteca.demo.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.demo.Model.Exemplar;
import com.biblioteca.demo.Model.Livro;

public interface ExemplarRepository extends JpaRepository<Exemplar, Long> {

    // Busca todos os exemplares de um livro
    List<Exemplar> findByLivro(Livro livro);

    // Outra opção: buscar por id do livro
    List<Exemplar> findByLivroId(Long idLivro);
}
