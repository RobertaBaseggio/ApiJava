package br.com.senai.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ProdutoDTO {

    String produto;
    int quantidade;
    double valor;
    double estoque;

}
