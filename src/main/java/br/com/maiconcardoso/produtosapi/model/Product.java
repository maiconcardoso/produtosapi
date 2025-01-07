package br.com.maiconcardoso.produtosapi.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Product implements Serializable {
    private static final long serialVersionUID = 1l;

    private String id;
    private String name;
    private String desciption;
    private Double price;

}
