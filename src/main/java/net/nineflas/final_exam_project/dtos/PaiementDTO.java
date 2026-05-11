package net.nineflas.final_exam_project.dtos;

import lombok.*;
import net.nineflas.final_exam_project.enums.TypePaiement;

import java.time.LocalDate;

@Data
@NoArgsConstructor @AllArgsConstructor
public class PaiementDTO {
    private Long id;
    private LocalDate date;
    private Double montant;
    private TypePaiement type;
    private Long contratId;
}
