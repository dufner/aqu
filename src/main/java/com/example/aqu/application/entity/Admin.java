package com.example.aqu.application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
public class Admin {
    @Id
    private String id;
    private String name;
    private Integer age;
    private Gender type;

    @Size(min=1, message="You must choose at least 1 book")
    @OneToMany()
    private List<Aquariumist> aquariumists;
    public enum Gender {
        MALE, FEMALE, FRY
    }



}
