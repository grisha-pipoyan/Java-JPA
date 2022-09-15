package com.example.springdatajpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@Entity
@EntityListeners(AuditableListener.class)
public class Publisher implements Auditable{

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Timestamp dataCreated;
    private Timestamp lastUpdated;

    public Publisher(String name) {
        this.name = name;
    }

    @Override
    public Timestamp getDateCreated() {
        return dataCreated;
    }

    @Override
    public Timestamp getLastUpdated() {
        return dataCreated;
    }

    @Override
    public void setDateCreated(Timestamp dataCreated) {
        this.dataCreated = dataCreated;
    }

    @Override
    public void seLastUpdated(Timestamp lastUpdated){
        this.lastUpdated = lastUpdated;
    }

}
