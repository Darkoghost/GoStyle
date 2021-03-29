package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

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

    @OneToMany(mappedBy = "coupon")
    private Set<User_coupon> user_couponSet;

    public Coupon() {

    }

    public Coupon(Long idCoupon, String titre, int reduc, Date dateexpire, Produit produit, Set<User_coupon> user_couponSet) {
        this.idCoupon = idCoupon;
        this.titre = titre;
        this.reduc = reduc;
        this.dateexpire = dateexpire;
        this.produit = produit;
        this.user_couponSet = user_couponSet;
    }

    public Long getIdCoupon() {
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
        return user_couponSet;
    }

    public void setUser_coupon(Set<User_coupon> user_couponSet) {
        this.user_couponSet = user_couponSet;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "idCoupon=" + idCoupon +
                ", titre='" + titre + '\'' +
                ", reduc=" + reduc +
                ", dateexpire=" + dateexpire +
                ", produit=" + produit +
                ", user_couponSet=" + user_couponSet +
                '}';
    }
}
