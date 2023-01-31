package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "job_title")
public class JobTitle {

    //Columns in table JobTitle
    @Id
    @Column(name = "id")
    private long id;
    private String job_title_name;


    //Connections of entities
    //Connection to entity JobEmployee
    @OneToMany(mappedBy = "jobTitle")
    private Set<JobEmployee> jobEmployees = new LinkedHashSet<>();
    public Set<JobEmployee> getJobEmployees() {
        return jobEmployees;
    }
    public void setJobEmployees(Set<JobEmployee> jobEmployees) {
        this.jobEmployees = jobEmployees;
    }


    // Getters, setters, constructors for JobTitle
    public JobTitle() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getJob_title_name() {
        return job_title_name;
    }
    public void setJob_title_name(String job_title_name) {
        this.job_title_name = job_title_name;
    }


    //Standard methods
    @Override
    public String toString() {
        return "JobTitle {" +
                "id = " + id +
                ", job_title_name = '" + job_title_name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobTitle jobTitle = (JobTitle) o;
        return id == jobTitle.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
