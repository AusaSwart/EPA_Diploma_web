package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class LogStatement {

    //Columns in table LogStatement
    @Id
    private long id;
    private long id_employee;
    private long id_approver;
    private String comment_ls;
    private int days_sum;
    private int type_leave;
    private int approve;
    private Date date_leave;
    private Date date_of_ls;


    //Connections of entities
    //Connection to entity Document
    @OneToMany(mappedBy = "logStatement")
    private Set<Document> documents = new LinkedHashSet<>();
    public Set<Document> getDocuments() {
        return documents;
    }
    public void setDocuments(Set<Document> documents) {
        this.documents = documents;
    }

    //Connection to entity Employee
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_employee", nullable = false, insertable = false, updatable = false)
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    // Getters, setters, constructors for LogStatement
    public LogStatement() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_approver() {
        return id_approver;
    }
    public void setId_approver(long id_approver) {
        this.id_approver = id_approver;
    }
    public long getId_employee() {
        return id_employee;
    }
    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
    }
    public String getComment_ls() {
        return comment_ls;
    }
    public void setComment_ls(String comment_ls) {
        this.comment_ls = comment_ls;
    }
    public int getDays_sum() {
        return days_sum;
    }
    public void setDays_sum(int days_sum) {
        this.days_sum = days_sum;
    }
    public int getType_leave() {
        return type_leave;
    }
    public void setType_leave(int type_leave) {
        this.type_leave = type_leave;
    }
    public int getApprove() {
        return approve;
    }
    public void setApprove(int approve) {
        this.approve = approve;
    }
    public Date getDate_leave() {
        return date_leave;
    }
    public void setDate_leave(Date date_leave) {
        this.date_leave = date_leave;
    }
    public Date getDate_of_ls() {
        return date_of_ls;
    }
    public void setDate_of_ls(Date date_of_ls) {
        this.date_of_ls = date_of_ls;
    }


    //Standard methods
    @Override
    public String toString() {
        return "LogStatement {" +
                "id = " + id +
                ", id_approver = " + id_approver +
                ", id_employee = " + id_employee +
                ", comment_ls = '" + comment_ls + '\'' +
                ", days_sum = " + days_sum +
                ", type_leave = " + type_leave +
                ", approve = " + approve +
                ", date_leave = " + date_leave +
                ", date_of_ls = " + date_of_ls +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogStatement that = (LogStatement) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
