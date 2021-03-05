package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Coupon implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idCoupon;

    private String titre;

    private int reduc;

    private Date dateexpire;

    @OneToMany(mappedBy = "coupon")
    private List<Produit> produitList;

    @OneToMany(mappedBy = "coupon")
    private Set<User_coupon> user_coupon;

    public Coupon() {

    }

    public Coupon(Long idCoupon, String titre, int reduc, Date dateexpire, List<Produit> produitList) {
        this.idCoupon = idCoupon;
        this.titre = titre;
        this.reduc = reduc;
        this.dateexpire = dateexpire;
        this.produitList = produitList;
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

    public List<Produit> getProduitList() {
        return produitList;
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
                ", produitList=" + produitList +
                '}';
    }
}
