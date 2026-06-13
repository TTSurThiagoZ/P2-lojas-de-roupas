package br.edu.fiec.lojaDeRoupas.repository;

import br.edu.fiec.lojaDeRoupas.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findAllByCategoria(String categoria);

    List<Produto> findAllByTamanho(String tamanho);

}
