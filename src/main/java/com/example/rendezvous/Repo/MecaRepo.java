package com.example.rendezvous.Repo;


import com.example.rendezvous.Entity.Meca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MecaRepo extends JpaRepository<Meca, Long> {

    Meca findByIdMeca(Long idMeca);
}
