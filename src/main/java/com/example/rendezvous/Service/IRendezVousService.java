package com.example.rendezvous.Service;

import com.example.rendezvous.Entity.Client;
import com.example.rendezvous.Entity.Meca;
import com.example.rendezvous.Entity.RendezVous;
import org.yaml.snakeyaml.comments.CommentLine;

import java.util.List;

public interface IRendezVousService {

    Client addClient(Client client);

    Meca addMeca(Meca meca);

    void addRDVAndAssignMecaAndClient(RendezVous rdv, Long idMeca, Long idClient);


    void updateRendezVous(RendezVous rdv);

    void deleteRendezVous(Long idRDV);

    List<RendezVous> getAllRendezVous();

   RendezVous getRendezVousById(Long id);
}