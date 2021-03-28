package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Coupon implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idCoupon;

    private String titre;

    private int reduc;

    private Date dateexpire;

    @ManyToOne
    private Produit produit;



    public Coupon() {

    }

    public Coupon(Long idCoupon, String titre, int reduc, Date dateexpire, Produit produit) {
        this.idCoupon = idCoupon;
        this.titre = titre;
        this.reduc = reduc;
        this.dateexpire = dateexpire;
        this.produit = produit;
    }

    public Long getIdCoupon() {
        return idCoupon;
    }

    public void setIdCoupon(Long idCoupon) {
        this.idCoupon = idCoupon;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getReduc() {
        return reduc;
    }

    public void setReduc(int reduc) {
        this.reduc = reduc;
    }

    public Date getDateexpire() {
        return dateexpire;
    }

    public void setDateexpire(Date dateexpire) {
        this.dateexpire = dateexpire;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "idCoupon=" + idCoupon +
                ", titre='" + titre + '\'' +
                ", reduc=" + reduc +
                ", dateexpire=" + dateexpire +
                ", produit=" + produit +
                '}';
    }
}
