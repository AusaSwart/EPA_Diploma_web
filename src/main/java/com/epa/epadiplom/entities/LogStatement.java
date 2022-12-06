package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "log_statement")
public class LogStatement {
    @Id
    @Column(name = "id")
    private long id;
    private long id_approver;
    private long id_employee;
    private String comment_ls;
    private int days_sum;
    private int type_leave;
    private int approve;
    private Date date_leave;
    private Date date_of_ls;

    @OneToMany(mappedBy = "logStatement")
    private List<Document> documents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;

    public LogStatement() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getIdApprover() {
        return id_approver;
    }
    public void setIdApprover(long id_approver) {
        this.id_approver = id_approver;
    }
    public long getIdEmployee() {
        return id_employee;
    }
    public void setIdEmployee(long id_employee) {
        this.id_employee = id_employee;
    }
    public String getCommentLs() {return comment_ls;}
    public void setCommentLs(String comment_ls) {
        this.comment_ls = comment_ls;
    }
    public int getDaysSum() {return days_sum;}
    public void setDaysSum(int days_sum) {
        this.days_sum = days_sum;
    }
    public int getTypeLeave() {return type_leave;}
    public void setTypeLeave(int type_leave) {
        this.type_leave = type_leave;
    }
    public int getApprove() {return approve;}
    public void setApprove(int approve) {
        this.approve = approve;
    }
    public Date getDateLeave() {
        return date_leave;
    }
    public void setDateLeave(Date date_leave) {
        this.date_leave = date_leave;
    }
    public Date getDateOfLs() {
        return date_of_ls;
    }
    public void setDateOfLs(Date date_of_ls) {
        this.date_of_ls = date_of_ls;
    }

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
