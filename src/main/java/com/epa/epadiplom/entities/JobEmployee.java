package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "job_employee")
public class JobEmployee {

    @Id
    @Column(name = "id")
    private long id;
    private long id_employee;
    private long id_job_title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_job_title")
    private JobTitle jobTitle;
    public JobEmployee() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getIdEmployee() {
        return id_employee;
    }
    public void setIdEmployee(long id_employee) {
        this.id_employee = id_employee;
    }
    public long getIdJobTitle() {
        return id_job_title;
    }
    public void setIdJobTitle(long id_job_title) {
        this.id_job_title = id_job_title;
    }

    @Override
    public String toString() {
        return "JobEmployee {" +
                "id_employee = " + id_employee +
                ", id_job_title = " + id_job_title +
                ", id = " + id +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobEmployee that = (JobEmployee) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
