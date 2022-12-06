package com.epa.epadiplom.entities;

import jakarta.persistence.*;

@Entity
public class JobEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long id_employee;
    private long id_job_title;


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

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder(" ");
//        sb.append("Employee №").append(id_employee);
//        sb.append(" id of job title № ").append(id_job_title);
//        sb.append(" , id - ").append(id);
//        sb.append("\n");
//        return sb.toString();
//    }
}
