package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.HashSet;
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
    private Set<EmployeeTask> employeeTasks = new HashSet<>();

    public Task() {
    }
    public Task(Date date_task, String name_of_task, Set<Employee> employees) {
        this.date_task = date_task;
        this.name_of_task = name_of_task;
    }

    public Set<EmployeeTask> getEmployeeTasks() {
        return employeeTasks;
    }
    public void setEmployeeTasks(Set<EmployeeTask> employeeTasks) {
        this.employeeTasks = employeeTasks;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getDate_task() {
        return date_task;
    }
    public void setDate_task(Date date_task) {
        this.date_task = date_task;
    }
    public String getName_of_task() {
        return name_of_task;
    }
    public void setName_of_task(String name_of_task) {
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
