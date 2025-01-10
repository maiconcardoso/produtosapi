package br.com.maiconcardoso.produtosapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maiconcardoso.produtosapi.models.Product;
import br.com.maiconcardoso.produtosapi.repositories.ProductRepository;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void insert(@RequestBody Product product) {
        repository.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Product findById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("{id}")
    public Product update(@PathVariable Long id, @RequestBody Product entity) {
        entity.setId(id);
        return repository.save(entity);
    }

}
