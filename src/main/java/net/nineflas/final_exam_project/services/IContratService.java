package net.nineflas.final_exam_project.services;

import net.nineflas.final_exam_project.dtos.ContratDTO;
import net.nineflas.final_exam_project.entities.ContratAuto;
import net.nineflas.final_exam_project.entities.ContratHabitation;
import net.nineflas.final_exam_project.entities.ContratSante;

import java.util.List;

public interface IContratService {
    ContratDTO saveAuto(ContratAuto contrat, Long clientId);
    ContratDTO saveHabitation(ContratHabitation contrat, Long clientId);
    ContratDTO saveSante(ContratSante contrat, Long clientId);
    List<ContratDTO> getAll();
}
