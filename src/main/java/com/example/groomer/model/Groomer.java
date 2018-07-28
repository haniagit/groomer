package com.example.groomer.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Groomer {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String profile;

    @OneToMany (mappedBy = "groomer")
    List<Client> clients;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
