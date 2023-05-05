package com.epa.epadiplom.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//To suppress serializing properties with null values
@JsonSerialize
//Ignoring new fields on JSON objects
@JsonIgnoreProperties(ignoreUnknown = true)
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
    @Column(name = "comment_te")
    private String commentTe;
}
