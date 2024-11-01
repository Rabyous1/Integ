package com.example.rendezvous.Repo;

import com.example.rendezvous.Entity.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RendezVousRepo extends JpaRepository<RendezVous, Long> {

    List<RendezVous> findByMecaIdMeca(Long idMeca);
}
