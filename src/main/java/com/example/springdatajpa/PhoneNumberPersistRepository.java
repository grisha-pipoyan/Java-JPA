package com.example.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberPersistRepository extends JpaRepository<PhoneNumber, Long> {
}
