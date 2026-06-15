package br.edu.fiec.lojaDeRoupas.model.entity;

import br.edu.fiec.lojaDeRoupas.model.dto.ClienteDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String email;


    // Construtor a partir do DTO
    public Cliente(ClienteDTO clienteDTO) {
        setNome(clienteDTO.getNome());
        setCpf(clienteDTO.getCpf());
        setEmail(clienteDTO.getEmail());
        setEndereco(clienteDTO.getEndereco());
    }

}
