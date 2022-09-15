package com.example.springdatajpa;

import org.hibernate.criterion.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PersistRepository persistRepository,
                                        PersistPublisherRepository persistPublisherRepository){

        return args->{

            Publisher publisher = new Publisher("Adam");
            //persistPublisherRepository.save(publisher);

            Article article = new Article();
            article.setContent("Some test content");
            article.setPublisher(publisher);

            Article article1 = new Article();
            article1.setContent("Barev erkir");
            article1.setPublisher(publisher);


            persistRepository.save(article1);
            persistRepository.save(article);

        };
    }

}
