package net.nineflas.final_exam_project.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.nineflas.final_exam_project.enums.TypeLogement;


@Entity @Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("HABITATION")
public class ContratHabitation extends Contrat {
    @Enumerated(EnumType.STRING)
    private TypeLogement typeLogement;
    private String adresseLogement;
    private Double superficie;
}