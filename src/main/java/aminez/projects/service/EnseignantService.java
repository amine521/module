package aminez.projects.service;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Service;

import aminez.projects.dto.EnseignantDto;
import aminez.projects.mapper.EnseignantMapper;
import aminez.projects.model.Enseignant;
import aminez.projects.repositories.EnseignantRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EnseignantService {
    private final EnseignantRepository enseignantRepository;
    private final EnseignantMapper enseignantMapper;

    public Enseignant ajouterEnseignant(EnseignantDto enseignantDto) {
        Enseignant enseignant = enseignantMapper.maptoEnseignant(enseignantDto);
        enseignant.setDateCreation(Instant.now());
        enseignant.setEnabled(false);
        return enseignantRepository.save(enseignant);
    }

    public List<Enseignant> getALL() {
        return enseignantRepository.findAll();
    }
}
