package com.example.aqu.application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)

public class Ground {

    @Id
    private String id;
    private String name;
    private TypeOfGround type;
    @OneToOne
    private Aquarium aquarium;
    public enum TypeOfGround {
        SAND, PEBLE
    }
}
