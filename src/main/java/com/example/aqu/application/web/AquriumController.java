package com.example.aqu.application.web;


import com.example.aqu.application.data.*;
import com.example.aqu.application.entity.Aquarium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class AquriumController {

    private final AquriumRepository aquriumRepository;
    private final AquriumistRepository aquriumistRepository;
    private final AdminRepository adminRepository;
    private final FishRepository fishRepository;
    private final GroundRepository groundRepository;




    @Autowired
    public AquriumController(AquriumRepository aquriumRepository, AquriumistRepository aquriumistRepository, AdminRepository adminRepository, FishRepository fishRepository, GroundRepository groundRepository) {
        this.aquriumRepository = aquriumRepository;
        this.aquriumistRepository = aquriumistRepository;
        this.adminRepository = adminRepository;
        this.fishRepository = fishRepository;
        this.groundRepository = groundRepository;
    }

    @GetMapping("/findAll")
    public @ResponseBody Iterable<Aquarium> findAll() {

        return aquriumRepository.findAll();
    }

//    @GetMapping("/findById")
//    public @ResponseBody Optional<Book> findByID(String id) {
//        return bookRepo.findById(id);
//    }
//
//
//
//    @DeleteMapping("/deleteById")
//    public void deleteByID(String id) {
//        bookRepo.deleteById(id);
//    }

}
