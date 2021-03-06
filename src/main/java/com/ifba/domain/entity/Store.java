package com.ifba.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Store {
    @Id
    private Long id;
    private String name;
    private String cpf;
}
