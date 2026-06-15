package br.edu.fiec.lojaDeRoupas.controller;

import br.edu.fiec.lojaDeRoupas.model.dto.ClienteDTO;
import br.edu.fiec.lojaDeRoupas.model.entity.Cliente;
import br.edu.fiec.lojaDeRoupas.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
@RequestMapping(value = "clientes")
public class ClienteController {

    private ClienteService clienteService;

    // Cadastrar Cliente
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void cadastrarCliente(@org.springframework.web.bind.annotation.RequestBody ClienteDTO clienteDTO) {
        clienteService.cadastrarCliente(clienteDTO);
    }

    // Retorna todos os clientes
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Cliente> buscarTodos() {
        return clienteService.buscarTodos();
    }

    // Busca 1: Retorna por ID
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "{id}", produces = APPLICATION_JSON_VALUE)
    public Cliente buscarPorId(@PathVariable Integer id) {
        return clienteService.buscarPorId(id);
    }

    // Busca 2: Retorna por CPF
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "cpf", produces = APPLICATION_JSON_VALUE)
    public Cliente buscarPorCpf(@RequestParam String cpf) {
        return clienteService.buscarPorCpf(cpf);
    }

    // Busca 3: Retorna por Email
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "email", produces = APPLICATION_JSON_VALUE)
    public Cliente buscarPorEmail(@RequestParam String email) {
        return clienteService.buscarPorEmail(email);
    }

    // Atualizar Cliente
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping(value = "{id}", consumes = APPLICATION_JSON_VALUE)
    public void atualizar(@PathVariable Integer id, @org.springframework.web.bind.annotation.RequestBody ClienteDTO clienteDTO) {
        clienteService.atualizar(id, clienteDTO);
    }

    // Deletar Cliente
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "{id}")
    public void apagar(@PathVariable Integer id) {
        clienteService.apagar(id);
    }

}
