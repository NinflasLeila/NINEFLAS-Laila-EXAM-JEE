package net.nineflas.final_exam_project.dtos;

import net.nineflas.final_exam_project.enums.StatutContrat;
import net.nineflas.final_exam_project.enums.TypeLogement;

import java.time.LocalDate;

public record ContratHabitationDTO(
        Long id,
        LocalDate dateSouscription,
        StatutContrat statut,
        LocalDate dateValidation,
        Double montantCotisation,
        Integer dureeContrat,
        Double tauxCouverture,
        Long clientId,
        TypeLogement typeLogement,
        String adresseLogement,
        Double superficie
) {}
