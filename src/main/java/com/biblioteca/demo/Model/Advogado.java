package com.biblioteca.demo.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Advogado extends Funcionario{

    
    private String numeroOAB;

}
