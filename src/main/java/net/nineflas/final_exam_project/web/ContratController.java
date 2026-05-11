package net.nineflas.final_exam_project.web;

import lombok.RequiredArgsConstructor;
import net.nineflas.final_exam_project.dtos.ContratDTO;
import net.nineflas.final_exam_project.entities.ContratAuto;
import net.nineflas.final_exam_project.entities.ContratHabitation;
import net.nineflas.final_exam_project.entities.ContratSante;
import net.nineflas.final_exam_project.services.IContratService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/contrats")
@RequiredArgsConstructor
public class ContratController {

    private final IContratService contratService;

    @GetMapping
    public ResponseEntity<List<ContratDTO>> getAll() {
        return ResponseEntity.ok(contratService.getAll());
    }

    @PostMapping("/auto/{clientId}")
    public ResponseEntity<ContratDTO> saveAuto(@RequestBody ContratAuto contrat,
                                               @PathVariable Long clientId) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(contratService.saveAuto(contrat, clientId));
    }

    @PostMapping("/habitation/{clientId}")
    public ResponseEntity<ContratDTO> saveHabitation(@RequestBody ContratHabitation contrat,
                                                     @PathVariable Long clientId) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(contratService.saveHabitation(contrat, clientId));
    }

    @PostMapping("/sante/{clientId}")
    public ResponseEntity<ContratDTO> saveSante(@RequestBody ContratSante contrat,
                                                @PathVariable Long clientId) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(contratService.saveSante(contrat, clientId));
    }
}
