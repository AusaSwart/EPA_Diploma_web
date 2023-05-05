package com.epa.epadiplom.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

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
@Table(name = "task", schema = "public", catalog = "EPA")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "date_task")
    private Date dateTask;
    @Column(name = "name_of_task")
    private String nameOfTask;
    @Column(name = "comment_te")
    private String commentTe;
    @Column(name = "id_executor")
    private long idExecutor;

    @OneToMany(mappedBy = "task")
    private Set<EmployeeTask> employeeTasks = new LinkedHashSet<>();
}
