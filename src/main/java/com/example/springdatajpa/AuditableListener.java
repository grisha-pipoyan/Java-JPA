package com.example.springdatajpa;

import org.springframework.data.domain.AuditorAware;

import javax.persistence.PrePersist;
import java.sql.Timestamp;
import java.time.Instant;

public class AuditableListener {

    @PrePersist
    void preCreate(Object auditableObj){
        Auditable auditable = (Auditable)auditableObj;
        Timestamp now = Timestamp.from(Instant.now());
        auditable.setDateCreated(now);
        auditable.setLastUpdated(now);
    }

}
