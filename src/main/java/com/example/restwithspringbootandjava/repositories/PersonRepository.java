package com.example.restwithspringbootandjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restwithspringbootandjava.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
