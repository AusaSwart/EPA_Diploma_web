package com.epa.epadiplom.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.util.Date;
import java.util.Objects;

@Entity
@Immutable
@Getter
@NoArgsConstructor
@Table(name = "ls_view", schema = "public", catalog = "EPA")
public class LogStatementsView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private int type_leave;
    private Date date_of_ls;
    private int days_sum;
    @Column(name = "id_approver")
    private long idApprover;
    private int approve;
    private String comment_ls;
    private long id_employee;
    private String body_doc;
    private String role;

    public LogStatementsView(long id,
                             int type_leave,
                             Date date_of_ls,
                             int days_sum,
                             long idApprover,
                             int approve,
                             String comment_ls,
                             long id_employee,
                             String body_doc,
                             String role) {
        this.id = id;
        this.type_leave = type_leave;
        this.date_of_ls = date_of_ls;
        this.days_sum = days_sum;
        this.idApprover = idApprover;
        this.approve = approve;
        this.comment_ls = comment_ls;
        this.id_employee = id_employee;
        this.body_doc = body_doc;
        this.role = role;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getType_leave() {
        return type_leave;
    }
    public void setType_leave(int type_leave) {
        this.type_leave = type_leave;
    }
    public Date getDate_of_ls() {
        return date_of_ls;
    }
    public void setDate_of_ls(Date date_of_ls) {
        this.date_of_ls = date_of_ls;
    }
    public int getDays_sum() {
        return days_sum;
    }
    public void setDays_sum(int days_sum) {
        this.days_sum = days_sum;
    }
    public long getIdApprover() {
        return idApprover;
    }
    public void setIdApprover(long idApprover) {
        this.idApprover = idApprover;
    }
    public int getApprove() {
        return approve;
    }
    public void setApprove(int approve) {
        this.approve = approve;
    }
    public String getComment_ls() {
        return comment_ls;
    }
    public void setComment_ls(String comment_ls) {
        this.comment_ls = comment_ls;
    }
    public long getId_employee() {
        return id_employee;
    }
    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
    }
    public String getBody_doc() {
        return body_doc;
    }
    public void setBody_doc(String body_doc) {
        this.body_doc = body_doc;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogStatementsView that = (LogStatementsView) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return "LogStatementsView{" +
                "id=" + id +
                ", type_leave=" + type_leave +
                ", date_of_ls=" + date_of_ls +
                ", days_sum=" + days_sum +
                ", id_approver=" + idApprover +
                ", approve=" + approve +
                ", comment_ls='" + comment_ls + '\'' +
                ", id_employee=" + id_employee +
                ", body_doc='" + body_doc + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
