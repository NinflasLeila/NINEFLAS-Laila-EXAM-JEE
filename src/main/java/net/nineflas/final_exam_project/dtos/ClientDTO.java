package net.nineflas.final_exam_project.dtos;

import lombok.*;

@Data @NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    private Long id;
    private String nom;
    private String email;
}

