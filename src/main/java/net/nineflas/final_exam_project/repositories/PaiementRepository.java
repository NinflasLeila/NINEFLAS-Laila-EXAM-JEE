package net.nineflas.final_exam_project.repositories;

import net.nineflas.final_exam_project.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PaiementRepository  extends JpaRepository<Paiement, Long> {
    List<Paiement> findByContratId(Long contratId);
}
