package net.nineflas.final_exam_project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity @Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("AUTO")
public class ContratAuto extends Contrat {
    private String numImmatriculation;
    private String marqueVehicule;
    private String modeleVehicule;
}
