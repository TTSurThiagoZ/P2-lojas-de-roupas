package br.edu.fiec.lojaDeRoupas.service;

import br.edu.fiec.lojaDeRoupas.model.dto.ProdutoDTO;
import br.edu.fiec.lojaDeRoupas.model.entity.Produto;
import br.edu.fiec.lojaDeRoupas.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public void criarCamisa(ProdutoDTO produtoDTO) {
        produtoRepository.save(new Produto("Camisa", produtoDTO));
    }

    public void criarCalca(ProdutoDTO produtoDTO) {
        produtoRepository.save(new Produto("Calça", produtoDTO));
    }

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    public List<Produto> buscarTodasCamisas() {
        return produtoRepository.findAllByCategoria("Camisa");
    }

    public List<Produto> buscarTodasCalcas() {
        return produtoRepository.findAllByCategoria("Calça");
    }

    public Produto buscarProdutoPorId(Integer id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public List<Produto> buscarTodosPorTamanho(String tamanho) {
        return produtoRepository.findAllByTamanho(tamanho);
    }

    public void apagar(Integer id) {
        produtoRepository.deleteById(id);
    }

    public void atualizar(Integer id, ProdutoDTO produtoDTO) {
        Produto produto = produtoRepository.findById(id).orElse(null);

        if (produto != null) {
            produto.setNome(produtoDTO.getNome());
            produto.setTamanho(produtoDTO.getTamanho());
            produto.setCor(produtoDTO.getCor());
            produto.setPreco(produtoDTO.getPreco());
            produto.setQuantidadeEstoque(produtoDTO.getQuantidadeEstoque()); // ← campo esquecido no atualizar
            produto.setCategoria(produtoDTO.getCategoria());                 // ← categoria também não era atualizada

            produtoRepository.save(produto);
        }
    }
}
