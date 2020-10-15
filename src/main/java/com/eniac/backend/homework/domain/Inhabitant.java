package com.eniac.backend.homework.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Inhabitant extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date dob;
    private String photo;

    @ManyToMany(mappedBy = "inhabitants")
    private List<Environment> environments;

    @OneToMany
    @JoinColumn(name = "admin_inhabitant_id", referencedColumnName = "id")
    private List<Environment> administeredEnvironments;


    public Inhabitant() {

    }

    public Inhabitant(String firstName, String email, String password) {
        this.firstName = firstName;
        this.email = email;
        this.password = password;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inhabitant user = (Inhabitant) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<Environment> environments) {
        this.environments = environments;
    }

    public List<Environment> getAdministeredEnvironments() {
        return administeredEnvironments;
    }

    public void setAdministeredEnvironments(List<Environment> administeredEnvironments) {
        this.administeredEnvironments = administeredEnvironments;
    }
}
