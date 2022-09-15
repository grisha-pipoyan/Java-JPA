package com.example.springdatajpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@EntityListeners(AuditableListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Article implements Auditable{

    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Publisher publisher;

    private Timestamp dataCreated;
    private Timestamp lastUpdated;

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
