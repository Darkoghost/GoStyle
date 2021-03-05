package fr.gostyle.app.dal;

import fr.gostyle.app.domain.Produit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProduitRepository extends CrudRepository<Produit, Long> {

    List<Produit> findByNom(String nom);
}
