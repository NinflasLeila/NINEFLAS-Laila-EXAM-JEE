package net.nineflas.final_exam_project.entities;


import jakarta.persistence.*;
import net.nineflas.final_exam_project.enums.StatutContrat;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE_CONTRAT")
public abstract class Contrat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateSouscription;
    @Enumerated(EnumType.STRING)
    private StatutContrat statut;
    private LocalDate dateValidation;
    private Double montantCotisation;
    private Integer dureeContrat;
    private Double tauxCouverture;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
    private List<Paiement> paiements;
}
