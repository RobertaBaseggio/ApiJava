package br.com.senai.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class PessoaDTO {

    private Long codigo;
    private String nome;
    private UsuarioDTO usuario;

}
