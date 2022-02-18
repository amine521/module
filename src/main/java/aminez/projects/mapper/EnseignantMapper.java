package aminez.projects.mapper;

import org.springframework.stereotype.Component;

import aminez.projects.dto.EnseignantDto;
import aminez.projects.model.Enseignant;

@Component
public class EnseignantMapper {

    public Enseignant maptoEnseignant(EnseignantDto enseignantDto){
       return Enseignant.builder()
       .nom(enseignantDto.getNom())
       .prenom(enseignantDto.getPrenom())
       .password(enseignantDto.getPassword())
       .email(enseignantDto.getEmail())
       .telephone(enseignantDto.getTelephone())
       .build();
       
    }
    
}
