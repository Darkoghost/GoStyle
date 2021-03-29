package fr.gostyle.app.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import java.util.UUID;

@Entity
public class Coupon implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String idCoupon;

    private String titre;

    private int reduc;

    private Date dateexpire;

    @ManyToOne
    private Produit produit;

    @OneToMany(mappedBy = "coupon")
    private Set<User_coupon> user_coupon;

    public Coupon() {

    }

    public Coupon(String idCoupon, String titre, int reduc, Date dateexpire, Produit produit, Set<User_coupon> user_coupon) {
        this.idCoupon = idCoupon;
        this.titre = titre;
        this.reduc = reduc;
        this.dateexpire = dateexpire;
        this.produit = produit;
        this.user_coupon = user_coupon;
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

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Set<User_coupon> getUser_coupon() {
        return user_coupon;
    }

    public void setUser_coupon(Set<User_coupon> user_coupon) {
        this.user_coupon = user_coupon;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "idCoupon=" + idCoupon +
                ", titre='" + titre + '\'' +
                ", reduc=" + reduc +
                ", dateexpire=" + dateexpire +
                ", produit=" + produit +
                ", user_coupon=" + user_coupon +
                '}';
    }
}
