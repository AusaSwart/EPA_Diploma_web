package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "job_employee", schema = "public", catalog = "EPA")
public class JobEmployee {

    //Columns in table JobEmployee
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private long id_employee;
    private long id_job_title;

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

    //Connection to entity JobTitle
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_job_title")
    private JobTitle jobTitle;
    public JobTitle getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }


    // Getters, setters, constructors for JobEmployee
    public JobEmployee(long id_employee,
                       long id_job_title) {
        this.id_employee = id_employee;
        this.id_job_title = id_job_title;
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


    //Standard methods
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
