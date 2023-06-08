package com.example.aqu.application.data;

import com.example.aqu.application.entity.Fish;
import org.springframework.data.repository.CrudRepository;


public interface FishRepository extends CrudRepository<Fish,String> {
}
