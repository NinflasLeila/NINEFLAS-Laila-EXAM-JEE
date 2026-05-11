package net.nineflas.final_exam_project.services;

import lombok.RequiredArgsConstructor;
import net.nineflas.final_exam_project.dtos.ClientDTO;
import net.nineflas.final_exam_project.mappers.Mapper;
import net.nineflas.final_exam_project.repositories.ClientRepository;
import net.nineflas.final_exam_project.services.IClientService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class ClientServiceImpl implements IClientService {

    private final ClientRepository repo;
    private final Mapper mapper;

    @Override
    public ClientDTO save(ClientDTO dto) {
        return mapper.toClientDTO(repo.save(mapper.toClientEntity(dto)));
    }

    @Override
    public List<ClientDTO> getAll() {
        return repo.findAll().stream().map(mapper::toClientDTO).toList();
    }

    @Override
    public ClientDTO getById(Long id) {
        return repo.findById(id).map(mapper::toClientDTO)
                .orElseThrow(() -> new RuntimeException("Client introuvable"));
    }
}