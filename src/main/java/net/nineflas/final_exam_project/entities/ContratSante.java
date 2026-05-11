package net.nineflas.final_exam_project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.nineflas.final_exam_project.enums.NiveauCouverture;


@Entity @Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("SANTE")
public class ContratSante extends Contrat {
    @Enumerated(EnumType.STRING)
    private NiveauCouverture niveauCouverture;
    private Integer nbPersonnesCouvertes;
}
