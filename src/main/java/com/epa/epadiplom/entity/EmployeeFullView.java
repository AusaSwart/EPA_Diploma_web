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
@Table(name = "employee_full_info_view", schema = "public", catalog = "EPA")
public class EmployeeFullView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "id_login")
    private long idLogin;
    private String first_name;
    private String middle_name;
    private String last_name;
    private Date birth_d;
    private Date entry_d;
    @Column(name = "login_user")
    private String loginUser;
    private String password_user;
    private String mail_user;
    private String role;
    private long work_number;
    private long personal_number;
    private String location_street;
    private String cabinet_office;
    private String name_dep;
    private String job_title_name;
}
