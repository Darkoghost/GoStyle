package fr.gostyle.app.domain;

import javax.persistence.*;

@Entity
public class User_coupon {


    @EmbeddedId
    User_couponkey id;

    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "idUser")
    private User user;

    @ManyToOne
    @MapsId("idCoupon")
    @JoinColumn(name = "idCoupon")
    private Coupon coupon;

    @Column(name = "ISUSED")
    private boolean isUsed;

    public User_coupon(User user, Coupon coupon, boolean isUsed) {
        this.user = user;
        this.coupon = coupon;
        this.isUsed = isUsed;
    }

    public User_coupon() {

    }

    public User_couponkey getId() {
        return id;
    }

    public void setId(User_couponkey id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}




