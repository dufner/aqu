package com.example.aqu.application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)

public class Aquariumist {

        @Id
        private String id;
        private String name;
        private Integer age;
        private Aquariumist.Gender type;

        @Size(min=1, message="You must choose at least 1 aquarium")
        @OneToMany()
        private List<Aquarium> aquariums;
        public enum Gender {
            MALE, FEMALE
        }
}
