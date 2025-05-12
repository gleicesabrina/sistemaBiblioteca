package com.biblioteca.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.demo.Model.Exemplar;
import com.biblioteca.demo.Repository.ExemplarRepository;

@RestController
@RequestMapping("/exemplares")
public class ExemplarController {

    @Autowired
    private ExemplarRepository exemplarRepository;

    // Busca exemplares por ID do livro
    @GetMapping("/livro/{idLivro}")
    public List<Exemplar> getExemplaresPorLivro(@PathVariable Long idLivro) {
        return exemplarRepository.findByLivroId(idLivro);
    }
}

