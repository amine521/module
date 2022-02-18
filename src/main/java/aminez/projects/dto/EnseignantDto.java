package aminez.projects.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnseignantDto {
    private String nom;
    private String prenom;
    private String password;
    private String telephone;
    private String email;
    
}
