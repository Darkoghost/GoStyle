package fr.gostyle.app.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String idUser;

    private String name;

    @JoinColumn(name = "last_name")
    private String lastName;

    private String email;

    private String mdp;

    private String adresse;

    @JoinColumn(name = "is_admin")
    private boolean isAdmin;

    @ManyToMany
    @JoinTable(name = "user_coupon",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "idUser"),
            inverseJoinColumns = @JoinColumn(name = "id_coupon", referencedColumnName = "idCoupon"))
    private Set<Coupon> couponSet;

    public User() {
    }

    public User(String idUser, String name, String lastName, String email, String mdp, String adresse, boolean isAdmin, Set<Coupon> couponSet) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.mdp = mdp;
        this.adresse = adresse;
        this.isAdmin = isAdmin;
        this.couponSet = couponSet;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMdp() {
        return mdp;
    }

    public String getAdresse() {
        return adresse;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public Set<Coupon> getCouponSet() {
        return couponSet;
    }

    public void setCouponSet(Set<Coupon> user_coupon) {
        this.couponSet = user_coupon;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mdp='" + mdp + '\'' +
                ", adresse='" + adresse + '\'' +
                ", isAdmin=" + isAdmin +
                ", user_coupon=" + couponSet +
                '}';
    }
}
