package aminez.projects.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aminez.projects.model.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {
    
}
