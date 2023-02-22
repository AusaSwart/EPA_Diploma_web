package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.sql.Date;


@Entity
@Immutable
@Getter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_full_info_view", schema = "public", catalog = "EPA")
public class EmployeeFullView {

    //Columns in table EmployeeFullView
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private long id_login;
    private String first_name;
    private String middle_name;
    private String last_name;
    private Date birth_d;
    private Date entry_d;
    private String login_user;
    private String password_user;
    private String mail_user;
    private String role;
    // mb there will be status
    // add it later
    // private String status;
    private long personal_number;
    private long work_number;
    private String location_street;
    private String cabinet_office;
    private String name_dep;
    private String job_title_name;

}
