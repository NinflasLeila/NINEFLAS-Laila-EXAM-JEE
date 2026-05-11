package net.nineflas.final_exam_project.mappers;



import net.nineflas.final_exam_project.dtos.ClientDTO;
import net.nineflas.final_exam_project.entities.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDTO toDTO(Client client);
    Client toEntity(ClientDTO dto);
}

