package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduit;

    private String nom;

    private String description;

    @OneToMany
    private Set<Coupon> coupons;

    public Produit() {
    }

    public Produit(Long idProduit, String nom, String description, Set<Coupon> coupons) {
        this.idProduit = idProduit;
        this.nom = nom;
        this.description = description;
        this.coupons = coupons;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
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
