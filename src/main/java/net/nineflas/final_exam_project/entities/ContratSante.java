package net.nineflas.final_exam_project.entities;

import jakarta.persistence.*;
import net.nineflas.final_exam_project.enums.NiveauCouverture;

@Entity
public class ContratSante extends Contrat {
    @Enumerated(EnumType.STRING)
    private NiveauCouverture niveauCouverture;
    private Integer nbPersonnesCouvertes;
}
