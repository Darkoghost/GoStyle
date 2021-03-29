package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduit = UUID.randomUUID();

    private String nom;

    private String description;

    @OneToMany(mappedBy = "produit")
    private Set<Coupon> coupons;

    public Produit() {
    }

    public Produit(UUID idProduit, String nom, String description, Set<Coupon> coupons) {
        this.idProduit = idProduit;
        this.nom = nom;
        this.description = description;
        this.coupons = coupons;
    }

    public UUID getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(UUID idProduit) {
        this.idProduit = idProduit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(Set<Coupon> coupons) {
        this.coupons = coupons;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "idProduit=" + idProduit +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", coupons=" + coupons +
                '}';
    }
}
