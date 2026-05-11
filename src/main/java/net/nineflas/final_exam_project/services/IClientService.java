package net.nineflas.final_exam_project.services;

import net.nineflas.final_exam_project.dtos.ClientDTO;
import java.util.List;

public interface IClientService {
    ClientDTO save(ClientDTO dto);
    List<ClientDTO> getAll();
    ClientDTO getById(Long id);
}

