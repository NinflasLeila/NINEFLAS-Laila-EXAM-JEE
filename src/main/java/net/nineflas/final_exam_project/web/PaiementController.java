package net.nineflas.final_exam_project.web;

import lombok.RequiredArgsConstructor;
import net.nineflas.final_exam_project.dtos.PaiementDTO;
import net.nineflas.final_exam_project.entities.Paiement;
import net.nineflas.final_exam_project.services.IPaiementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/paiements")
@RequiredArgsConstructor
public class PaiementController {

    private final IPaiementService paiementService;

    @GetMapping("/contrat/{contratId}")
    public ResponseEntity<List<PaiementDTO>> getByContrat(@PathVariable Long contratId) {
        return ResponseEntity.ok(paiementService.getByContrat(contratId));
    }

    @PostMapping("/{contratId}")
    public ResponseEntity<PaiementDTO> save(@RequestBody Paiement paiement,
                                            @PathVariable Long contratId) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(paiementService.save(paiement, contratId));
    }
}
