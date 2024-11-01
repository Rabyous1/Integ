package com.example.rendezvous.Service;

import com.example.rendezvous.Entity.Client;
import com.example.rendezvous.Entity.Meca;
import com.example.rendezvous.Entity.RendezVous;
import com.example.rendezvous.Repo.ClientRepo;
import com.example.rendezvous.Repo.MecaRepo;
import com.example.rendezvous.Repo.RendezVousRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class RendezVousService implements IRendezVousService {

    ClientRepo clientRepo;
    MecaRepo mecaRepo;
    RendezVousRepo rendezVousRepo;

    @Override
    public Client addClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Meca addMeca(Meca meca) {
        return mecaRepo.save(meca);
    }


    @Override
        public void addRDVAndAssignMecaAndClient(RendezVous rdv, Long idMeca, Long idClient) {

        Client client =clientRepo.findByIdClient(idClient);
        Meca meca =mecaRepo.findByIdMeca(idMeca);
        rdv.setClient(client);
        rdv.setMeca(meca);
        rendezVousRepo.save(rdv);
    }

    @Override
    public void updateRendezVous(RendezVous rdv) {
        rendezVousRepo.save(rdv);
    }

    @Override
    public void deleteRendezVous(Long idRDV) {

        rendezVousRepo.deleteById(idRDV);
    }

    @Override
    public List<RendezVous> getAllRendezVous() {
        return rendezVousRepo.findAll();
    }

    @Override
    public RendezVous getRendezVousById(Long id) {
        return rendezVousRepo.findById(id).orElse(null);
    }
}
