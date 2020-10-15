package com.eniac.backend.homework.domain;

import com.eniac.backend.homework.domain.enums.TaskStatus;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Task extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private String schedule;
    private String points;

    @Enumerated(EnumType.ORDINAL)
    private TaskStatus status;

    @ManyToOne
    @JoinColumn(name = "environment_id", referencedColumnName = "id")
    private Environment environment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) &&
                Objects.equals(name, task.name);
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

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
