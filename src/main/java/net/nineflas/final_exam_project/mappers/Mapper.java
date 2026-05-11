package net.nineflas.final_exam_project.mappers;

import net.nineflas.final_exam_project.dtos.ClientDTO;
import net.nineflas.final_exam_project.dtos.ContratDTO;
import net.nineflas.final_exam_project.dtos.PaiementDTO;
import net.nineflas.final_exam_project.entities.*;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    // --- Client ---
    public ClientDTO toClientDTO(Client c) {
        ClientDTO dto = new ClientDTO();
        dto.setId(c.getId());
        dto.setNom(c.getNom());
        dto.setEmail(c.getEmail());
        return dto;
    }

    public Client toClientEntity(ClientDTO dto) {
        Client c = new Client();
        c.setNom(dto.getNom());
        c.setEmail(dto.getEmail());
        return c;
    }

    // --- Contrat ---
    public ContratDTO toContratDTO(Contrat c) {
        ContratDTO dto = new ContratDTO();
        dto.setId(c.getId());
        dto.setStatut(c.getStatut());
        dto.setMontantCotisation(c.getMontantCotisation());
        dto.setDureeContrat(c.getDureeContrat());
        dto.setClientId(c.getClient().getId());
        if      (c instanceof ContratAuto)       dto.setTypeContrat("AUTO");
        else if (c instanceof ContratHabitation) dto.setTypeContrat("HABITATION");
        else if (c instanceof ContratSante)      dto.setTypeContrat("SANTE");
        return dto;
    }

    // --- Paiement ---
    public PaiementDTO toPaiementDTO(Paiement p) {
        PaiementDTO dto = new PaiementDTO();
        dto.setId(p.getId());
        dto.setDate(p.getDate());
        dto.setMontant(p.getMontant());
        dto.setType(p.getType());
        dto.setContratId(p.getContrat().getId());
        return dto;
    }
}