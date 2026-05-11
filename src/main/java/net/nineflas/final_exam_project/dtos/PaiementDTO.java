package net.nineflas.final_exam_project.dtos;

import net.nineflas.final_exam_project.enums.TypePaiement;

import java.time.LocalDate;

public record PaiementDTO(
        Long id,
        LocalDate date,
        Double montant,
        TypePaiement type,
        Long contratId
) {}
