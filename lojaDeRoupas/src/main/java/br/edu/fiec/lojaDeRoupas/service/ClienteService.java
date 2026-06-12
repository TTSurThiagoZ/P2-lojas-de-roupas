package br.edu.fiec.lojaDeRoupas.service;

import br.edu.fiec.lojaDeRoupas.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteService {

    private ClienteRepository clienteRepository;

}
