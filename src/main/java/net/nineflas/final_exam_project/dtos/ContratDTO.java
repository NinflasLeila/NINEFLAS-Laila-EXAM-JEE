package net.nineflas.final_exam_project.dtos;


import net.nineflas.final_exam_project.enums.StatutContrat;

import java.time.LocalDate;

public record ContratDTO(
        Long id,
        LocalDate dateSouscription,
        StatutContrat statut,
        LocalDate dateValidation,
        Double montantCotisation,
        Integer dureeContrat,
        Double tauxCouverture,
        Long clientId,
        String typeContrat
) {}
