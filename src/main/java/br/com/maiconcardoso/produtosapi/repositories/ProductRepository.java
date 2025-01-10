package br.com.maiconcardoso.produtosapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maiconcardoso.produtosapi.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
