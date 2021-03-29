package fr.gostyle.app.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
public class Coupon implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String idCoupon;

    private String titre;

    private int reduc;

    private Date dateexpire;

    private boolean isFree;

    @ManyToOne
    private Produit produit;

    @ManyToMany(mappedBy = "couponSet")
    private Set<User> userSet;

    public Coupon() {

    }

    public Coupon(String idCoupon, String titre, int reduc, Date dateexpire, boolean isFree, Produit produit, Set<User> userSet) {
        this.idCoupon = idCoupon;
        this.titre = titre;
        this.reduc = reduc;
        this.dateexpire = dateexpire;
        this.isFree = isFree;
        this.produit = produit;
        this.userSet = userSet;
    }

    public String getIdCoupon() {
        return idCoupon;
    }

    public String getTitre() {
        return titre;
    }

    public int getReduc() {
        return reduc;
    }

    public Date getDateexpire() {
        return dateexpire;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> user_coupon) {
        this.userSet = user_coupon;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "idCoupon='" + idCoupon + '\'' +
                ", titre='" + titre + '\'' +
                ", reduc=" + reduc +
                ", dateexpire=" + dateexpire +
                ", isFree=" + isFree +
                ", produit=" + produit +
                ", userSet=" + userSet +
                '}';
    }
}
