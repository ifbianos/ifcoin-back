package com.ifba.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
public class UserRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Size(min = 2, max = 32, message = "O Seu username deve ter entre 2 a 32 caracteres")
    private String username;
    @Size(min = 6, max = 32, message = "O Seu password deve ter entre 6 a 32 caracteres")
    private String password;



}
