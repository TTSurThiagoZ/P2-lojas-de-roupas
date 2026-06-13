package br.edu.fiec.lojaDeRoupas.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tamanho; /* tamanhos disponiveis: P, M e G */

    @Column(nullable = false)
    private String cor;

    @Column(nullable = false)
    private Float preco;

    @Column(nullable = false)
    private Integer quantidade;






}
