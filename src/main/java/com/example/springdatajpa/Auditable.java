package com.example.springdatajpa;

import java.sql.Timestamp;

public interface Auditable {
    Timestamp getDateCreated();
    void setDateCreated(Timestamp dataCreated);
    Timestamp getLastUpdated();
    void setLastUpdated(Timestamp lastUpdated);

    void seLastUpdated(Timestamp lastUpdated);
}
