package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Coupon implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idCoupon;

    private String Titre;

    private int reduc;

    private Date dateexpire;


    public Coupon() {

    }

    public Coupon(Long idCoupon, String titre, int reduc, Date dateexpire) {
        this.idCoupon = idCoupon;
        Titre = titre;
        this.reduc = reduc;
        this.dateexpire = dateexpire;
    }

    public Long getIdCoupon() {
        return idCoupon;
    }

    public String getTitre() {
        return Titre;
    }

    public int getReduc() {
        return reduc;
    }

    public Date getDateexpire() {
        return dateexpire;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "idCoupon=" + idCoupon +
                ", Titre='" + Titre + '\'' +
                ", reduc=" + reduc +
                ", dateexpire=" + dateexpire +
                '}';
    }
}
