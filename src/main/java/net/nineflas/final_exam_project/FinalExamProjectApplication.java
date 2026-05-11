package net.nineflas.final_exam_project;

import net.nineflas.final_exam_project.dtos.ClientDTO;
import net.nineflas.final_exam_project.entities.ContratAuto;
import net.nineflas.final_exam_project.entities.ContratHabitation;
import net.nineflas.final_exam_project.entities.ContratSante;
import net.nineflas.final_exam_project.entities.Paiement;
import net.nineflas.final_exam_project.enums.NiveauCouverture;
import net.nineflas.final_exam_project.enums.TypeLogement;
import net.nineflas.final_exam_project.enums.TypePaiement;
import net.nineflas.final_exam_project.services.IClientService;
import net.nineflas.final_exam_project.services.IContratService;
import net.nineflas.final_exam_project.services.IPaiementService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FinalExamProjectApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =
                SpringApplication.run(FinalExamProjectApplication.class, args);

        IClientService clientService  = ctx.getBean(IClientService.class);
        IContratService contratService = ctx.getBean(IContratService.class);
        IPaiementService paiementService= ctx.getBean(IPaiementService.class);

        // --- Clients ---
        ClientDTO c1 = clientService.save(new ClientDTO(null, "Laila Ninflas",   "laila@mail.com"));
        ClientDTO c2 = clientService.save(new ClientDTO(null, "Sara El Amrani",  "sara@mail.com"));
        ClientDTO c3 = clientService.save(new ClientDTO(null, "Yassine Bennani", "yassine@mail.com"));

        System.out.println("===== CLIENTS =====");
        clientService.getAll().forEach(System.out::println);

        // --- Contrats ---
        ContratAuto auto = new ContratAuto();
        auto.setMontantCotisation(3500.0); auto.setDureeContrat(12);
        auto.setNumImmatriculation("25643-A-12");
        auto.setMarqueVehicule("Mercedes"); auto.setModeleVehicule("Classe A");
        contratService.saveAuto(auto, c1.getId());

        ContratHabitation hab = new ContratHabitation();
        hab.setMontantCotisation(2200.0); hab.setDureeContrat(24);
        hab.setTypeLogement(TypeLogement.APPARTEMENT);
        hab.setAdresseLogement("Maarif, Casablanca"); hab.setSuperficie(120.0);
        contratService.saveHabitation(hab, c2.getId());

        ContratSante sante = new ContratSante();
        sante.setMontantCotisation(4800.0); sante.setDureeContrat(12);
        sante.setNiveauCouverture(NiveauCouverture.PREMIUM);
        sante.setNbPersonnesCouvertes(5);
        contratService.saveSante(sante, c3.getId());

        System.out.println("===== CONTRATS =====");
        contratService.getAll().forEach(System.out::println);

        // --- Paiements ---
        Paiement p1 = new Paiement(); p1.setMontant(3500.0); p1.setType(TypePaiement.MENSUALITE);
        paiementService.save(p1, 1L);

        Paiement p2 = new Paiement(); p2.setMontant(2200.0); p2.setType(TypePaiement.MENSUALITE);
        paiementService.save(p2, 2L);

        System.out.println("===== PAIEMENTS CONTRAT 1 =====");
        paiementService.getByContrat(1L).forEach(System.out::println);
    }
}