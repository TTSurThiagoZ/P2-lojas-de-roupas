package br.edu.fiec.lojaDeRoupas.controller;

import br.edu.fiec.lojaDeRoupas.model.dto.ProdutoDTO;
import br.edu.fiec.lojaDeRoupas.model.entity.Produto;
import br.edu.fiec.lojaDeRoupas.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
@RequestMapping(value = "produtos")
public class ProdutoController {

    private ProdutoService produtoService;

    //Criação de camisa
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "camisa", consumes = APPLICATION_JSON_VALUE)
    public void criarCamisa(@RequestBody ProdutoDTO produtoDTO) {
        produtoService.criarCamisa(produtoDTO);
    }

    // Criação de Calça
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "calca", consumes = "application/json")
    public void criarCalca(@RequestBody ProdutoDTO produtoDTO) {
        produtoService.criarCalca(produtoDTO);
    }

    // Retorna todos os produtos
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Produto> buscarTodos() {
        return produtoService.buscarTodos();
    }

    // Retorna todas as camisas
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "camisas", produces = APPLICATION_JSON_VALUE)
    public List<Produto> buscarTodasCamisas() {
        return produtoService.buscarTodasCamisas();
    }

    // Retorna todas as calças
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "calcas", produces = APPLICATION_JSON_VALUE)
    public List<Produto> buscarTodasCalcas() {
        return produtoService.buscarTodasCalcas();
    }

    // Retorna o produto por id
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "{id}", produces = APPLICATION_JSON_VALUE)
    public Produto buscarProdutoPorId(@PathVariable Integer id) {  // ← era @RequestParam
        return produtoService.buscarProdutoPorId(id);
    }

    // Retorna produtos pelo tamanho
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "tamanho", produces = APPLICATION_JSON_VALUE)
    public List<Produto> buscarTodosPorTamanho(@RequestParam String tamanho) {
        return produtoService.buscarTodosPorTamanho(tamanho);
    }

    // Atualiza um produto (Completando o CRUD)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping(value = "{id}", consumes = APPLICATION_JSON_VALUE)
    public void atualizar(@PathVariable Integer id, @RequestBody ProdutoDTO produtoDTO) {  // ← era @RequestParam
        produtoService.atualizar(id, produtoDTO);
    }

    // Deleta um produto (Completando o CRUD)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "{id}")
    public void apagar(@PathVariable Integer id) {  // ← era @RequestParam
        produtoService.apagar(id);
    }

}
