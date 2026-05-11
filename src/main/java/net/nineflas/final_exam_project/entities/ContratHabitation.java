package net.nineflas.final_exam_project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import net.nineflas.final_exam_project.enums.TypeLogement;

@Entity
public class ContratHabitation extends Contrat {
    @Enumerated(EnumType.STRING)
    private TypeLogement typeLogement;
    private String adresseLogement;
    private Double superficie;
}
