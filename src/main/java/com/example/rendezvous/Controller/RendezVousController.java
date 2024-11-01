package com.example.rendezvous.Controller;

import com.example.rendezvous.Entity.Client;
import com.example.rendezvous.Entity.Meca;
import com.example.rendezvous.Entity.RendezVous;
import com.example.rendezvous.Service.IRendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/rdv")
public class RendezVousController {

    @Autowired
    IRendezVousService rendezVousService  ;

    @PostMapping("/add-client")
    public Client addClient (@RequestBody Client client) {
        Client clt = rendezVousService.addClient(client);
        return clt;
    }

    @PostMapping("/add-meca")
    public Meca addMeca (@RequestBody Meca meca) {
        Meca mc = rendezVousService.addMeca(meca);
        return mc;
    }

    @PostMapping("/add-rdv/{meca}/{client}")
    public void addRDVAndAssignMecaAndClient(@RequestBody RendezVous rdv, @PathVariable("meca") Long meca , @PathVariable("client") Long client) {
        rendezVousService.addRDVAndAssignMecaAndClient(rdv,meca,client);

    }

    @PutMapping("/update-rdv/{id}")
    public void updateRendezVous(@PathVariable("id") Long id, @RequestBody RendezVous rdv) {
        rdv.setIdRDV(id); // Assurez-vous que l'ID du rendez-vous est correctement défini
        rendezVousService.updateRendezVous(rdv);
    }

    @DeleteMapping("/delete-rdv/{id}")
    public void deleteRendezVous(@PathVariable("id") Long id) {
        rendezVousService.deleteRendezVous(id);
    }

    @GetMapping("/all")
    public List<RendezVous> getAllRendezVous() {
        return rendezVousService.getAllRendezVous();
    }

    // Endpoint pour récupérer un rendez-vous spécifique en fonction de son ID
    @GetMapping("/{id}")
    public ResponseEntity<RendezVous> getRendezVousById(@PathVariable("id") Long id) {
        RendezVous rdv = rendezVousService.getRendezVousById(id);
        if (rdv != null) {
            return ResponseEntity.ok(rdv);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
