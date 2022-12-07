package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "id")
    private long id;
    private String name_dep;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employees = new HashSet<>();

    public Department() {
    }

    public Set<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName_dep() {
        return name_dep;
    }
    public void setName_dep(String name_dep) {
        this.name_dep = name_dep;
    }

    @Override
    public String toString() {
        return "Department {" +
                "id = " + id +
                ", name_dep = '" + name_dep + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
