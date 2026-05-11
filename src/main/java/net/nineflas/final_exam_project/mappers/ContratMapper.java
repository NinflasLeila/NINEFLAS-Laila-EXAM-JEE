package net.nineflas.final_exam_project.mappers;


import net.nineflas.final_exam_project.dtos.ContratAutoDTO;
import net.nineflas.final_exam_project.dtos.ContratHabitationDTO;
import net.nineflas.final_exam_project.dtos.ContratSanteDTO;
import net.nineflas.final_exam_project.entities.ContratAuto;
import net.nineflas.final_exam_project.entities.ContratHabitation;
import net.nineflas.final_exam_project.entities.ContratSante;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ContratMapper {
    @Mapping(target = "clientId", source = "client.id")
    ContratAutoDTO toAutoDTO(ContratAuto c);

    @Mapping(target = "client.id", source = "clientId")
    ContratAuto toAutoEntity(ContratAutoDTO dto);

    @Mapping(target = "clientId", source = "client.id")
    ContratHabitationDTO toHabitationDTO(ContratHabitation c);
    ContratHabitation toHabitationEntity(ContratHabitationDTO dto);

    @Mapping(target = "clientId", source = "client.id")
    ContratSanteDTO toSanteDTO(ContratSante c);
    ContratSante toSanteEntity(ContratSanteDTO dto);
}
