package com.example.aqu.application.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
//@Table(name= "aquariums")
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
public class Aquarium {
    @Id

    private String id;

    @Column(name = "title")
    private String name;


    @Column(name = "volume")
    private Integer volume;

    @Size(min=1, message="You must choose at least 1 book")
    @OneToMany()
    private List<Fish> fish;
}
