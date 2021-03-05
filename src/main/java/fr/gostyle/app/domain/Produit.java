package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduit;

    private String nom;

    private String description;

    public Produit() {
    }

    public Produit(Long idProduit, String nom, String description) {
        this.idProduit = idProduit;
        this.nom = nom;
        this.description = description;
    }


    public Long getIdProduit() {
        return idProduit;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "idProduit=" + idProduit +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}