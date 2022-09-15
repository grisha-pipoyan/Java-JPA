package com.example.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersistPublisherRepository extends JpaRepository<Publisher,Long> {
}
