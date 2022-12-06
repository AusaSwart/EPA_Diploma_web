package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "id")
    private long id;
    private String name_dep;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNameDep() {
        return name_dep;
    }
    public void setNameDep(String firstName) {
        this.name_dep = firstName;
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
