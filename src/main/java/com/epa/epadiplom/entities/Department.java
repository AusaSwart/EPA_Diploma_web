package com.epa.epadiplom.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name_dep;

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
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder(" id");
//        sb.append(" ").append(id);
//        sb.append(";  name of department: \'").append(name_dep).append('\'');
//        sb.append("\n");
//        return sb.toString();
//    }
}
