package br.upe.pweb.controle_peso.controlepeso.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.joda.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
@Entity 
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 200)
    private String nome;
    private String email;
    private int altura;
    private GeneroEnum genero;
    private double pesoInicial;
    private double pesoFinal;
    private LocalDate dataFinal;
    private LocalDate dataInicial;
}
