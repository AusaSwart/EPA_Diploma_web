package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Employee {

    //Columns in table Employee
    @Id
    private long id;
    private int privilege;
    private long id_dep;


    //Connection to entity Department
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dep")
    private Department department;
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }







    // Getters, setters, constructors for Employee
    public Employee() {
    }
    public Employee(int privilege, long id_dep, Set<Task> tasks) {
        this.privilege = privilege;
        this.id_dep = id_dep;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getPrivilege() {
        return privilege;
    }
    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }
    public long getId_dep() {
        return id_dep;
    }
    public void setId_dep(long id_dep) {
        this.id_dep = id_dep;
    }


    //Standard methods
    @Override
    public String toString() {
        return "Employee {" +
                "id = " + id +
                ", privilege = " + privilege +
                ", id_dep = " + id_dep +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
