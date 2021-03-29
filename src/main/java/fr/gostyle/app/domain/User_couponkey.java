package fr.gostyle.app.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class User_couponkey implements Serializable {


    private String idUser;

    private String idCoupon;

    public User_couponkey(String idUser, String idCoupon) {
        this.idUser = idUser;
        this.idCoupon = idCoupon;
    }

    public User_couponkey() {

    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdCoupon() {
        return idCoupon;
    }

    public void setIdCoupon(String idCoupon) {
        this.idCoupon = idCoupon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User_couponkey that = (User_couponkey) o;
        return idUser.equals(that.idUser) && idCoupon.equals(that.idCoupon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idCoupon);
    }
}
