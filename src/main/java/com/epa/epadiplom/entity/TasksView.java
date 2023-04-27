package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks_view", schema = "public", catalog = "EPA")
public class TasksView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private Date date_task;
    @Column(name = "id_task")
    private long idTask;
    @Column(name = "id_executor")
    private long idExecutor;
    @Column(name = "id_employee")
    private long idEmployee;
    private String comment_te;
}
