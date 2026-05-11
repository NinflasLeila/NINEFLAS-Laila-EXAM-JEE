package net.nineflas.final_exam_project.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.nineflas.final_exam_project.enums.StatutContrat;

import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor

public class ContratDTO {
    private Long id;
    private String typeContrat;
    private StatutContrat statut;
    private Double montantCotisation;
    private Integer dureeContrat;
    private Long clientId;
}