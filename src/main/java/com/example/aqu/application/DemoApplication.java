package com.example.aqu.application;

import com.example.aqu.application.data.*;
import com.example.aqu.application.entity.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication()
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	@Bean
	public CommandLineRunner dataLoader(FishRepository fishRepository,
										AquriumRepository aquriumRepository,
										AdminRepository adminRepository,
										AquriumistRepository aquriumistRepository,
										ContactRepository contactRepository) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {


				Fish fish= new Fish("1","Guppy",Fish.Gender.MALE);
				fishRepository.save(fish);
				Aquarium aquarium1= new Aquarium("1","aqurium_1",100,List.of(fish));
				aquriumRepository.save(aquarium1);
				Aquariumist aquriumist1= new Aquariumist("1","Add",22,Aquariumist.Gender.MALE,List.of(aquarium1));
				aquriumistRepository.save(aquriumist1);

				Admin admin1 = new Admin("123", "Adam",14, Admin.Gender.MALE, List.of(aquriumist1));
				Contact contact= new Contact(UUID.randomUUID(),admin1);
				adminRepository.save(admin1);

				contactRepository.save(contact);

			}
		};
	}


}
