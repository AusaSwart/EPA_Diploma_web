package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class JobEmployee {

    @Id
    private long id;
    private long id_employee;
    private long id_job_title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee", nullable = false, insertable = false, updatable = false)
    private Employee employee;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_job_title", nullable = false, insertable = false, updatable = false)
    private JobTitle jobTitle;

    public JobEmployee() {
    }

    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public JobTitle getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
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
    public long getId_job_title() {
        return id_job_title;
    }
    public void setId_job_title(long id_job_title) {
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
