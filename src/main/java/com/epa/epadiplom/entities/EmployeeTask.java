package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class EmployeeTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_executor;
    private long id_employee;
    private long id_task;
    private String comment_te;

    public EmployeeTask() {
    }

    public long getId() {
        return id_executor;
    }
    public void setId(long id_executor) {
        this.id_executor = id_executor;
    }
    public long getIdEmployee() {
        return id_employee;
    }
    public void setIdEmployee(long id_employee) {
        this.id_employee = id_employee;
    }
    public long getIdTask() {
        return id_task;
    }
    public void setIdTask(long id_task) {
        this.id_task = id_task;
    }
    public String getCommentTE() {
        return comment_te;
    }
    public void setCommentTE(String comment_te) {
        this.comment_te = comment_te;
    }

    @Override
    public String toString() {
        return "EmployeeTask {" +
                "id_executor = " + id_executor +
                ", id_employee = " + id_employee +
                ", id_task = " + id_task +
                ", comment_te = '" + comment_te + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTask that = (EmployeeTask) o;
        return id_executor == that.id_executor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_executor);
    }
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Notice : \n");
//        sb.append(" id of executor: ").append(id_executor);
//        sb.append(", id of employee: ").append(id_employee);
//        sb.append(", id of task: ").append(id_task);
//        sb.append(",\n   comment for task: \"").append(comment_te).append('\"');
//        return sb.toString();
//    }
}
