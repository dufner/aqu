package com.example.aqu.application.data;

import com.example.aqu.application.entity.Contact;
import com.example.aqu.application.entity.Ground;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface ContactRepository extends CrudRepository<Contact, UUID> {
}
