package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
public class User implements Serializable {

    @Id
    @Column(name = "id_User", length = 16, unique = true, nullable = false)
    private UUID idUser = UUID.randomUUID() ;

    private String name;

    private String lastName;

    private String email;

    private String mdp;

    private String adresse;

    @JoinColumn(name = "is_admin")
    private boolean isAdmin;

    @OneToMany(mappedBy = "user")
    private Set<User_coupon> user_coupon;

    public User() {
    }

    public User(UUID idUser, String name, String lastName, String email, String mdp, String adresse, boolean isAdmin, Set<User_coupon> user_coupon) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.mdp = mdp;
        this.adresse = adresse;
        this.isAdmin = isAdmin;
        this.user_coupon = user_coupon;
    }

    public UUID getIdUser() {
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
        return user_coupon;
    }

    public void setUser_coupon(Set<User_coupon> user_coupon) {
        this.user_coupon = user_coupon;
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
                ", user_coupon=" + user_coupon +
                '}';
    }
}
