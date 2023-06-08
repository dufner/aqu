package com.example.aqu.application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)

public class Fish {
    @Id
    private String id;
    private String name;
    private Fish.Gender type;


    public enum Gender {
        MALE, FEMALE, FRY
    }
}
