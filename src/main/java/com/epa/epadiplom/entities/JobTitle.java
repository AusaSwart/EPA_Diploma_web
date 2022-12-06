package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "job_title")
public class JobTitle {
    @Id
    @Column(name = "id")
    private long id;
    private String job_title_name;

    @OneToMany(mappedBy = "jobTitle")
    private List<JobEmployee> jobEmployees;

    public JobTitle() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getJobTitleName() {
        System.out.printf(job_title_name);
        return job_title_name;
    }
    public void setJobTitleName(String job_title_name) {
        this.job_title_name = job_title_name;
    }

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
