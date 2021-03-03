package fr.gostyle.app.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUser")
    private Long id;

    @Column(name = "NOM")
    private String name;

    @Column(name = "PRENOM")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MDP")
    private String mdp;

    @Column(name = "ADRESSE")
    private String adresse;

    @Column(name = "ISADMIN");
    private boolean isAdmin;

    public User() {
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
}
