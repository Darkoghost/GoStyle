package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUser")
    private Long id;

    private String name;

    private String lastName;

    private String email;

    private String mdp;

    private String adresse;

    private boolean isAdmin;

    @OneToMany(mappedBy = "user")
    private Set<User_coupon> user_coupon;

    public User() {
    }

    public User(Long id, String name, String lastName, String email, String mdp, String adresse, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.mdp = mdp;
        this.adresse = adresse;
        this.isAdmin = isAdmin;
    }

    public Long getId() {
        return id;
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
        return user_coupon;
    }

    public void setUser_coupon(Set<User_coupon> user_coupon) {
        this.user_coupon = user_coupon;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mdp='" + mdp + '\'' +
                ", adresse='" + adresse + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
