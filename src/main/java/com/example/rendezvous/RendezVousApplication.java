package com.example.rendezvous;

import com.example.rendezvous.Entity.Meca;
import com.example.rendezvous.Entity.Client;
import com.example.rendezvous.Entity.RendezVous;
import com.example.rendezvous.Repo.MecaRepo;
import com.example.rendezvous.Repo.ClientRepo;
import com.example.rendezvous.Repo.RendezVousRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

@SpringBootApplication
@EnableEurekaServer
public class RendezVousApplication {

    public static void main(String[] args) {
        SpringApplication.run(RendezVousApplication.class, args);
    }


}