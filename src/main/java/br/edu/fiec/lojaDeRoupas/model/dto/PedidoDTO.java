package br.edu.fiec.lojaDeRoupas.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {

    private Integer id;

    private Integer clienteId;

    private Integer produtoId;
}
