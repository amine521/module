package aminez.projects.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aminez.projects.dto.EnseignantDto;
import aminez.projects.model.Enseignant;
import aminez.projects.service.EnseignantService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/enseignants")
public class EnseignantController {

    private final EnseignantService enseignantService;

    @PostMapping("/ajouter")
    public ResponseEntity<Enseignant> ajouterEnseignant(@RequestBody EnseignantDto enseignantDto){

        return ResponseEntity.status(HttpStatus.CREATED)
        .body(enseignantService.ajouterEnseignant(enseignantDto));
    }

    @GetMapping
    public ResponseEntity<List<Enseignant>> getALL(){
        return ResponseEntity.status(HttpStatus.OK)
        .body(enseignantService.getALL());        
    }
    
}
