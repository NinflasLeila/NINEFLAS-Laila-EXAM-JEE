package net.nineflas.final_exam_project.services;

import net.nineflas.final_exam_project.dtos.PaiementDTO;
import net.nineflas.final_exam_project.entities.Paiement;

import java.util.List;


public interface IPaiementService {
    PaiementDTO save(Paiement paiement, Long contratId);
    List<PaiementDTO> getByContrat(Long contratId);
}