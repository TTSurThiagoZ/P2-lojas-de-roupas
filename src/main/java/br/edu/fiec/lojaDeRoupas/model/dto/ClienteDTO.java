package br.edu.fiec.lojaDeRoupas.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private Integer id;

    private String nome;

    private String cpf;

    private String endereco;

    private String email;

}
