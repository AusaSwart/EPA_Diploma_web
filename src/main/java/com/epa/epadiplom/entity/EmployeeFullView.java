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
@Table(name = "employee_full_info_view", schema = "public", catalog = "EPA")
public class EmployeeFullView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "id_login")
    private long idLogin;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birth_d")
    private Date birthD;
    @Column(name = "entry_d")
    private Date entryD;
    @Column(name = "login_user")
    private String loginUser;
    @Column(name = "password_user")
    private String passwordUser;
    @Column(name = "mail_user")
    private String mailUser;
    private String role;
    @Column(name = "work_number")
    private long workNumber;
    @Column(name = "personal_number")
    private long personalNumber;
    @Column(name = "location_street")
    private String locationStreet;
    @Column(name = "cabinet_office")
    private String cabinetOffice;
    @Column(name = "name_dep")
    private String nameDep;
    @Column(name = "job_title_name")
    private String jobTitleName;
}
