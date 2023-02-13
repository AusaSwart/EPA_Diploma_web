package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "emp_task", schema = "public", catalog = "EPA")
public class EmployeeTask {

    //Columns in table EmployeeTask
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private long id_employee;
    private long id_task;



    //Connections of entities
    //Connection to entity Employee
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_employee")
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    //Connection to entity Task
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_task")
    private Task task;
    public Task getTask() {
        return task;
    }
    public void setTask(Task task) {
        this.task = task;
    }


    // Getters, setters, constructors for EmployeeTask
    public EmployeeTask(long id_employee,
                        long id_task) {
        this.id_employee = id_employee;
        this.id_task = id_task;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_employee() {
        return id_employee;
    }
    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
    }
    public long getId_task() {
        return id_task;
    }
    public void setId_task(long id_task) {
        this.id_task = id_task;
    }


    //Standard methods
    @Override
    public String toString() {
        return "EmployeeTask {" +
                ", id_employee = " + id_employee +
                ", id_task = " + id_task +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTask that = (EmployeeTask) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
