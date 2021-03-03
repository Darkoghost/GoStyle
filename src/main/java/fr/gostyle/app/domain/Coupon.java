package fr.gostyle.app.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Coupon {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "idCoupon")
    private long id;

    @Column(name = "TITRE", length = 45)
    private String Titre;

    @Column(name = "REDUC")
    private int reduc;

    @Column(name = "DATE_EXPI")
    private Date dateexpire;


}
