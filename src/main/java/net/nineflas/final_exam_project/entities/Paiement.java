package net.nineflas.final_exam_project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;
import lombok.Getter;
import lombok.Setter;
import net.nineflas.final_exam_project.enums.TypePaiement;

import java.time.LocalDate;


@Getter @Setter
@Entity @Data
@NoArgsConstructor @AllArgsConstructor
public class Paiement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Double montant;
    @Enumerated(EnumType.STRING)
    private TypePaiement type;

    @ManyToOne
    private Contrat contrat;
}
