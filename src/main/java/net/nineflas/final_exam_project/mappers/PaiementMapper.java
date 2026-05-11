package net.nineflas.final_exam_project.mappers;

import net.nineflas.final_exam_project.dtos.PaiementDTO;
import net.nineflas.final_exam_project.entities.Paiement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaiementMapper {
    @Mapping(target = "contratId", source = "contrat.id")
    PaiementDTO toDTO(Paiement p);

    @Mapping(target = "contrat.id", source = "contratId")
    Paiement toEntity(PaiementDTO dto);
}