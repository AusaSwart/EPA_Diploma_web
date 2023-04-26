package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "task", schema = "public", catalog = "EPA")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date_task;
    private String name_of_task;
    private String comment_te;
    private long id_executor;

    @OneToMany(mappedBy = "task")
    private Set<EmployeeTask> employeeTasks = new LinkedHashSet<>();
}
