package com.example.rendezvous.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClient;
    String nomClient;
    int telephone;
    Date dateNaissance;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private Set<RendezVous> RendezVouss;

    public Client(String mouha, int i, Date date) {
    }
}
