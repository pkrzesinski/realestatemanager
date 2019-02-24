package com.manager.estate.shared.jpa;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class DatabaseEntity {

    @Id
    @GeneratedValue
    protected Long id;
}
