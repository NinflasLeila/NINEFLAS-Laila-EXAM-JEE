package net.nineflas.final_exam_project.services;

import lombok.RequiredArgsConstructor;
import net.nineflas.final_exam_project.dtos.ContratDTO;
import net.nineflas.final_exam_project.entities.Client;
import net.nineflas.final_exam_project.entities.ContratAuto;
import net.nineflas.final_exam_project.entities.ContratHabitation;
import net.nineflas.final_exam_project.entities.ContratSante;
import net.nineflas.final_exam_project.enums.StatutContrat;
import net.nineflas.final_exam_project.mappers.Mapper;
import net.nineflas.final_exam_project.repositories.ClientRepository;
import net.nineflas.final_exam_project.repositories.ContratRepository;
import net.nineflas.final_exam_project.services.IContratService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class ContratServiceImpl implements IContratService {

    private final ContratRepository repo;
    private final ClientRepository clientRepo;
    private final Mapper mapper;

    private Client findClient(Long id) {
        return clientRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Client introuvable"));
    }

    @Override
    public ContratDTO saveAuto(ContratAuto c, Long clientId) {
        c.setClient(findClient(clientId));
        c.setStatut(StatutContrat.EN_COURS);
        c.setDateSouscription(LocalDate.now());
        return mapper.toContratDTO(repo.save(c));
    }

    @Override
    public ContratDTO saveHabitation(ContratHabitation c, Long clientId) {
        c.setClient(findClient(clientId));
        c.setStatut(StatutContrat.EN_COURS);
        c.setDateSouscription(LocalDate.now());
        return mapper.toContratDTO(repo.save(c));
    }

    @Override
    public ContratDTO saveSante(ContratSante c, Long clientId) {
        c.setClient(findClient(clientId));
        c.setStatut(StatutContrat.EN_COURS);
        c.setDateSouscription(LocalDate.now());
        return mapper.toContratDTO(repo.save(c));
    }

    @Override
    public List<ContratDTO> getAll() {
        return repo.findAll().stream().map(mapper::toContratDTO).toList();
    }
}