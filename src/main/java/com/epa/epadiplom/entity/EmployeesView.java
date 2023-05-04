package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employees_view", schema = "public", catalog = "EPA")
public class EmployeesView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "id_employee")
    private long idEmployee;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "work_number")
    private long workNumber;
    @Column(name = "location_street")
    private String locationStreet;
    @Column(name = "cabinet_office")
    private String cabinetOffice;
    @Column(name = "name_dep")
    private String nameDep;
    @Column(name = "job_title_name")
    private String jobTitleName;

}
