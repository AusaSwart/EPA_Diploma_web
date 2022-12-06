package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @Column(name = "id")
    private long id;
    private Date date_task;
    private String name_of_task;

    @OneToMany(mappedBy = "task")
    private List<EmployeeTask> employeeTasks;

    public Task() {
    }

    public Task(Date date_task, String name_of_task, Set<Employee> employees) {
        this.date_task = date_task;
        this.name_of_task = name_of_task;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getDateTask() {
        return date_task;
    }
    public void setDateTask(Date date_task) {
        this.date_task = date_task;
    }
    public String getNameOfTask() {
        return name_of_task;
    }
    public void setNameOfTask(String name_of_task) {
        this.name_of_task = name_of_task;
    }

    @Override
    public String toString() {
        return "Task {" +
                "id = " + id +
                ", date_task = " + date_task +
                ", name_of_task = '" + name_of_task + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
