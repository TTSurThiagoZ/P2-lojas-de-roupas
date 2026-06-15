package br.edu.fiec.lojaDeRoupas.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

    private Integer id;

    private String categoria; //vai definir se é camisa, calça e etc..

    private String nome;

    private String tamanho; //tamanhos disponiveis: P, M e G

    private String cor;

    private Float preco;

    private Integer quantidadeEstoque;



}
