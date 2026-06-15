package br.edu.fiec.lojaDeRoupas.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String enderecoEntrega; // Resgatado automaticamente do Cliente

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente; // Relacionamento com Cliente

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto; // Relacionamento com Produto

    // Construtor
    public Pedido(String status, Cliente cliente, Produto produto) {
        setStatus(status);
        setCliente(cliente);
        setProduto(produto);
        setEnderecoEntrega(cliente.getEndereco()); // Vincula o endereço do cliente ao pedido
    }

}
