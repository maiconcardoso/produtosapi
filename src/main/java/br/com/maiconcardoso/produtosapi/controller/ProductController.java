package br.com.maiconcardoso.produtosapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maiconcardoso.produtosapi.model.Product;
import br.com.maiconcardoso.produtosapi.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository repository;

    @PostMapping
    public void insert(@RequestBody Product product) {
        repository.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        return repository.findAll();
    }
}
