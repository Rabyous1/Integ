package com.example.rendezvous.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRDV;

    private Date dateRDV;
    private String remarque;

    @ManyToOne
    private Meca meca;

    @ManyToOne
    private Client client;

    public RendezVous(Date date, String s, Meca meca, Client client) {
    }

    // Getters and Setters
}