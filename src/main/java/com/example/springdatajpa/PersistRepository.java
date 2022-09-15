package com.example.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersistRepository extends JpaRepository<Person, Long> {
}
