package com.example.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PersistRepository persistRepository,
                                        PhoneNumberPersistRepository phoneNumberPersistRepository){

        return args->{

            PhoneNumber phoneNumber = new PhoneNumber("095509515");
            phoneNumberPersistRepository.save(phoneNumber);

            Person person = new Person();
            person.setName("Grisha");
            person.setPhoneNumber(phoneNumber);

            persistRepository.save(person);

        };
    }

}
