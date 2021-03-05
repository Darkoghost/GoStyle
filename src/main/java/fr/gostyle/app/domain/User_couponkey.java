package fr.gostyle.app.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class User_couponkey implements Serializable {


    Long idUser;

    Long idCoupon;

    public User_couponkey(Long idUser, Long idCoupon) {
        this.idUser = idUser;
        this.idCoupon = idCoupon;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdCoupon() {
        return idCoupon;
    }

    public void setIdCoupon(Long idCoupon) {
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
