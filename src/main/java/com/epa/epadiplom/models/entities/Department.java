package com.epa.epadiplom.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "department", schema = "public", catalog = "EPA")
public class Department {

    //Columns in table Department
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String name_dep;


    //Connections of entities
    //Connection to entity Employee
    @OneToMany(mappedBy = "department")
    private Set<Employee> employees = new LinkedHashSet<>();
    public Set<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }


    // Getters, setters, constructors for Department
    public Department(String name_dep) {
        this.name_dep = name_dep;
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


    //Standard methods
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
