package com.example.aqu.application.data;

import com.example.aqu.application.entity.Aquarium;
import org.springframework.data.repository.CrudRepository;


public interface AquriumRepository extends CrudRepository<Aquarium,String> {
}
