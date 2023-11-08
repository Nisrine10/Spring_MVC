package com.mvc.patientspringmvc;

import com.mvc.patientspringmvc.entities.Patient;
import com.mvc.patientspringmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientSpringMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(PatientSpringMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(
                    new Patient(null, "Nisrine", new Date(), false, 22));

            patientRepository.save(
                    new Patient(null, "Nour",new Date(),false,30));

            patientRepository.save(
                    new Patient(null, "Amal",new Date(),false,55));

            patientRepository.save(
                    new Patient(null, "Aymen",new Date(),false,40));

            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };

    }

}
