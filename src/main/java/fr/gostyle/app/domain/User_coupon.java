package fr.gostyle.app.domain;

import javax.persistence.*;

@Entity
public class User_coupon {


    @EmbeddedId
    User_couponkey id;

    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "idUser")
    User user;

    @ManyToOne
    @MapsId("idCoupon")
    @JoinColumn(name = "idCoupon")
    Coupon coupon;

    @Column(name = "ISUSED")
    private boolean isUsed;


}




