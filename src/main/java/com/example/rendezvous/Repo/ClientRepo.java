package com.example.rendezvous.Repo;


import com.example.rendezvous.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {

    Client findByIdClient(Long idClient);


}
