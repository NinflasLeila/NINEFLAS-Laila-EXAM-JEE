package net.nineflas.final_exam_project.entities;

import jakarta.persistence.Entity;

@Entity
public class ContratAuto extends Contrat {
    private String numImmatriculation;
    private String marqueVehicule;
    private String modeleVehicule;
}
