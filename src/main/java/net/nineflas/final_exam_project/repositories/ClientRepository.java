package net.nineflas.final_exam_project.repositories;

import net.nineflas.final_exam_project.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ClientRepository extends JpaRepository<Client, Long> {
}
