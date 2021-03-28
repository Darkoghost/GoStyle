package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;

    private String name;

    private String lastName;

    private String email;

    private String mdp;

    private String adresse;

    private boolean isAdmin;

    @OneToMany(mappedBy = "user")
    private Set<User_coupon> user_couponSet;

    public User() {
    }

    public User(Long idUser, String name, String lastName, String email, String mdp, String adresse, boolean isAdmin, Set<User_coupon> user_couponSet) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.mdp = mdp;
        this.adresse = adresse;
        this.isAdmin = isAdmin;
        this.user_couponSet = user_couponSet;
    }

    public Long getIdUser() {
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

    public Set<User_coupon> getUser_coupon() {
        return user_couponSet;
    }

    public void setUser_coupon(Set<User_coupon> user_couponSet) {
        this.user_couponSet = user_couponSet;
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
                ", user_couponSet=" + user_couponSet +
                '}';
    }
}
