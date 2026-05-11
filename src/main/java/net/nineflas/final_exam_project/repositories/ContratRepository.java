package net.nineflas.final_exam_project.repositories;

import net.nineflas.final_exam_project.entities.Contrat;
import net.nineflas.final_exam_project.enums.StatutContrat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContratRepository   extends JpaRepository<Contrat, Long> {
    List<Contrat> findByClientId(Long clientId);
}

