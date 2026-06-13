package br.edu.fiec.lojaDeRoupas.repository;

import br.edu.fiec.lojaDeRoupas.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findAllByNome(String nome);

    List<Cliente> findAllByEmail(String email);

}
