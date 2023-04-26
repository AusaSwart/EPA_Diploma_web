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
@Table(name = "tasks_view", schema = "public", catalog = "EPA")
public class TasksView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long id_task;
    private String name_of_task;
    private Date date_task;
    private String comment_te;
    private long id_employee;
    @Column(name = "id_executor")
    private long idExecutor;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_task() {
        return id_task;
    }

    public void setId_task(long id_task) {
        this.id_task = id_task;
    }

    public String getName_of_task() {
        return name_of_task;
    }

    public void setName_of_task(String name_of_task) {
        this.name_of_task = name_of_task;
    }

    public Date getDate_task() {
        return date_task;
    }

    public void setDate_task(Date date_task) {
        this.date_task = date_task;
    }

    public String getComment_te() {
        return comment_te;
    }

    public void setComment_te(String comment_te) {
        this.comment_te = comment_te;
    }

    public long getId_employee() {
        return id_employee;
    }

    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
    }

    public long getIdExecutor() {
        return idExecutor;
    }

    public void setIdExecutor(long idExecutor) {
        this.idExecutor = idExecutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TasksView tasksView = (TasksView) o;
        return id == tasksView.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
