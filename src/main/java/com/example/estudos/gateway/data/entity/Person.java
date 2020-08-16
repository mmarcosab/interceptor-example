package com.example.estudos.gateway.data.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private LocalDateTime dataCadastro;

}
