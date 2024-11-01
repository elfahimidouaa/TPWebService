package ma.projet.TpXML.repository;

import ma.projet.TpXML.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
