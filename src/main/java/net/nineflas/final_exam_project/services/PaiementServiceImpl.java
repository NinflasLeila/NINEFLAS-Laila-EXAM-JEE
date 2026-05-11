package net.nineflas.final_exam_project.services;

import lombok.RequiredArgsConstructor;
import net.nineflas.final_exam_project.dtos.PaiementDTO;
import net.nineflas.final_exam_project.entities.Paiement;
import net.nineflas.final_exam_project.mappers.Mapper;
import net.nineflas.final_exam_project.repositories.ContratRepository;
import net.nineflas.final_exam_project.repositories.PaiementRepository;
import net.nineflas.final_exam_project.services.IPaiementService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiementService {

    private final PaiementRepository repo;
    private final ContratRepository contratRepo;
    private final Mapper mapper;

    @Override
    public PaiementDTO save(Paiement p, Long contratId) {
        p.setContrat(contratRepo.findById(contratId)
                .orElseThrow(() -> new RuntimeException("Contrat introuvable")));
        p.setDate(LocalDate.now());
        return mapper.toPaiementDTO(repo.save(p));
    }

    @Override
    public List<PaiementDTO> getByContrat(Long contratId) {
        return repo.findByContratId(contratId).stream()
                .map(mapper::toPaiementDTO).toList();
    }
}