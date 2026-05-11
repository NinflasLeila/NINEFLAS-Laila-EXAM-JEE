package net.nineflas.final_exam_project.entities;


import jakarta.persistence.*;
import lombok.*;
import net.nineflas.final_exam_project.enums.StatutContrat;

import java.time.LocalDate;
import java.util.List;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_contrat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Contrat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateSouscription;
    @Enumerated(EnumType.STRING)
    private StatutContrat statut;
    private Double montantCotisation;
    private Integer dureeContrat;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
    private List<Paiement> paiements;
}