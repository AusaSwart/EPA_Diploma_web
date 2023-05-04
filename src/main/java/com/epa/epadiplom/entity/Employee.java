package com.epa.epadiplom.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

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
@Table(name = "employee", schema = "public", catalog = "EPA")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
   @Column(insertable = false, updatable = false, name = "id_dep")
    private long idDep;
    @Column(name="first_name")
    private String firstName;
    @Column(name="middle_name")
    private String middleName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="work_number")
    private long workNumber;
    @Column(name="location_street")
    private String locationStreet;
    @Column(name="cabinet_office")
    private String cabinetOffice;

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

    @OneToMany(fetch = FetchType. LAZY,mappedBy = "employee")
    private Set<NoticeEvent> noticeEvents = new LinkedHashSet<>();

    @OneToMany(mappedBy = "employee")
    private Set<EmployeeTask> employeeTasks = new LinkedHashSet<>();
}
