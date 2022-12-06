package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date date_task;
    private String name_of_task;

    @ManyToMany
    @JoinTable(name = "employee_task", joinColumns = @JoinColumn(name = "id_task"),
    inverseJoinColumns = @JoinColumn(name = "id_employee"))
    private Set<Employee> employees = new HashSet<>();

    public Task() {
    }

    public Task(Date date_task, String name_of_task, Set<Employee> employees) {
        this.date_task = date_task;
        this.name_of_task = name_of_task;
        this.employees = employees;
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

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder(" ");
//        sb.append("№ ").append(id);
//        sb.append("   Date of task: '").append(date_task).append('\'');
//        sb.append("\n   Name of task: '").append(name_of_task).append('\'');
//        sb.append("\n");
//        return sb.toString();
//    }

}
