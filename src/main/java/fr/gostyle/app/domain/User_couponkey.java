package fr.gostyle.app.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class User_couponkey implements Serializable {


    UUID idUser;

    UUID idCoupon;

    public User_couponkey(UUID idUser, UUID idCoupon) {
        this.idUser = idUser;
        this.idCoupon = idCoupon;
    }

    public User_couponkey() {

    }

    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    public UUID getIdCoupon() {
        return idCoupon;
    }

    public void setIdCoupon(UUID idCoupon) {
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
