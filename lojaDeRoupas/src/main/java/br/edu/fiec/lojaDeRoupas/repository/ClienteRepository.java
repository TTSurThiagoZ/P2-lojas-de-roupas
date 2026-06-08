package br.edu.fiec.lojaDeRoupas.repository;

import br.edu.fiec.lojaDeRoupas.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
