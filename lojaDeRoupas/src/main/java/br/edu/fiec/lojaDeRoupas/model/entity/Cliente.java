package br.edu.fiec.lojaDeRoupas.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")

public class Cliente {
    @Id
    @GeneratedValue

    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String cpf;

}
