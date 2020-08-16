package com.example.estudos.gateway.data.repository;

import com.example.estudos.gateway.data.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query("SELECT p FROM Person p where p.dataCadastro = :pdataCadastro")
    public Person getByData(@Param("pdataCadastro") LocalDateTime dataCadastro);

}
