package com.will.minhasfinancas.model.entily;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table( name = "usuario", schema = "financas")
@Builder
@Data
public class Usuario {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

}