package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee", schema = "public", catalog = "EPA")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
   @Column(insertable = false, updatable = false)
   //@Column(name="id_dep")
    private long id_dep;
    @Column(name="first_name")
    private String firstName;
    private String middle_name;
    private String last_name;
    private long work_number;
    private String location_street;
    private String cabinet_office;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dep")
    private Department department;

    @OneToMany(mappedBy = "employee")
    private Set<LogStatement> logStatements = new LinkedHashSet<>();

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Personal personal;

    @OneToMany(mappedBy = "employee")
    private Set<JobEmployee> jobEmployees = new LinkedHashSet<>();

    @OneToMany(mappedBy = "employee")
    private Set<NoticeEvent> noticeEvents = new LinkedHashSet<>();

    @OneToMany(mappedBy = "employee")
    private Set<EmployeeTask> employeeTasks = new LinkedHashSet<>();
}
