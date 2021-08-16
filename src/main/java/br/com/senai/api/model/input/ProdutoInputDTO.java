package br.com.senai.api.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ProdutoInputDTO {

    @NotBlank
    String produto;

    int quantidade;

    double valor;
}
