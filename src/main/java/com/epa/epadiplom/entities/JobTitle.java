package com.epa.epadiplom.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String job_title_name;

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

//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("_");
//        sb.append("Job title: '").append(job_title_name).append('\'');
//        sb.append(" - ").append(id).append(" ");
//
//        return sb.toString();
//    }
}
