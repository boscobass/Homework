package com.eniac.backend.homework.domain;

import com.eniac.backend.homework.domain.enums.PunishmentStatus;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

public class Punishment extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String name;
    private String description;

    @Enumerated(EnumType.ORDINAL)
    private PunishmentStatus status;

    @ManyToOne
    @JoinColumn(name = "environment_id", referencedColumnName = "id")
    private Environment environment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punishment punishment = (Punishment) o;
        return Objects.equals(id, punishment.id) &&
                Objects.equals(name, punishment.name);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PunishmentStatus getStatus() {
        return status;
    }

    public void setStatus(PunishmentStatus status) {
        this.status = status;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
