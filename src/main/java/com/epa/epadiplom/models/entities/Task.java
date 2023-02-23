package com.epa.epadiplom.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "task", schema = "public", catalog = "EPA")
public class Task {

    //Columns in table Task
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date_task;
    private String name_of_task;
    private String comment_te;
    private long id_executor;


    //Connections of entities
    //Connection to entity EmployeeTask
    @OneToMany(mappedBy = "task")
    private Set<EmployeeTask> employeeTasks = new LinkedHashSet<>();
    public Set<EmployeeTask> getEmployeeTasks() {
        return employeeTasks;
    }
    public void setEmployeeTasks(Set<EmployeeTask> employeeTasks) {
        this.employeeTasks = employeeTasks;
    }


    // Getters, setters, constructors for Task
    public Task(Date date_task,
                String name_of_task,
                String comment_te,
                long id_executor) {
        this.date_task = date_task;
        this.name_of_task = name_of_task;
        this.comment_te = comment_te;
        this.id_executor = id_executor;
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
    public String getComment_te() {
        return comment_te;
    }
    public void setComment_te(String comment_te) {
        this.comment_te = comment_te;
    }
    public long getId_executor() {
        return id_executor;
    }
    public void setId_executor(long id_executor) {
        this.id_executor = id_executor;
    }


    //Standard methods
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
