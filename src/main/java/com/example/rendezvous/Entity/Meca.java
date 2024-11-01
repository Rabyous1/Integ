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
public class Meca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMeca;
    String nomMeca;
    Date dispo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="meca")
    private Set<RendezVous> RendezVouss;

    public Meca(String momen, Date date) {
    }
}
