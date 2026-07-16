package com.gabriel.projeto.entities;

import java.io.Serializable;
import java.util.Objects;

public class Users implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String prhone;
    private String password;

    public Users(){
    }

    //construtor
    public Users(Long id, String name, String email, String prhone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.prhone = prhone;
        this.password = password;
    }

    //getter e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrhone() {
        return prhone;
    }

    public void setPrhone(String prhone) {
        this.prhone = prhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
