package com.eniac.backend.homework.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Environment extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String name;
    private String photo;
    private String roundTime;

    @ManyToMany
    @JoinTable(
        name = "environments_inhabitants",
        joinColumns = @JoinColumn(name = "environment_id", referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name = "inhabitant_id", referencedColumnName = "ID")
    )
    private List<Inhabitant> inhabitants;

    @OneToMany
    @JoinColumn(name = "environment_id", referencedColumnName = "id")
    private List<Task> tasks;

    @OneToMany
    @JoinColumn(name = "environment_id", referencedColumnName = "id")
    private List<Punishment> punishments;

    @ManyToOne
    @JoinColumn(name = "admin_inhabitant_id", referencedColumnName = "id")
    private Inhabitant adminInhabitant;


    public Environment() {

    }

    public Environment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Environment environment = (Environment) o;
        return Objects.equals(id, environment.id) &&
                Objects.equals(name, environment.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRoundTime() {
        return roundTime;
    }

    public void setRoundTime(String roundTime) {
        this.roundTime = roundTime;
    }

    public List<Inhabitant> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(List<Inhabitant> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Punishment> getPunishments() {
        return punishments;
    }

    public void setPunishments(List<Punishment> punishments) {
        this.punishments = punishments;
    }

    public Inhabitant getAdminInhabitant() {
        return adminInhabitant;
    }

    public void setAdminInhabitant(Inhabitant adminInhabitant) {
        this.adminInhabitant = adminInhabitant;
    }
}
