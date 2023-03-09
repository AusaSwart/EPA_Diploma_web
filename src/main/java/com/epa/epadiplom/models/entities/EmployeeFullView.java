package com.epa.epadiplom.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Immutable;

import java.sql.Date;
import java.util.Objects;


@Entity
@Immutable
@Getter
@NoArgsConstructor
@Table(name = "employee_full_info_view", schema = "public", catalog = "EPA")
public class EmployeeFullView {

    //Columns in table EmployeeFullView
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
    private String login_user;
    private String password_user;
    private String mail_user;
    private String role;
    // mb there will be status
    // add it later
    // private String status;
    private long work_number;
    private long personal_number;
    private String location_street;
    private String cabinet_office;
    private String name_dep;
    private String job_title_name;

    // Getters, setters, constructors for EmployeeFullView


    public EmployeeFullView(
            long id,
            long idLogin,
            String first_name,
            String middle_name,
            String last_name,
            Date birth_d,
            Date entry_d,
            String login_user,
            String password_user,
            String mail_user,
            String role,
            long personal_number,
            long work_number,
            String location_street,
            String cabinet_office,
            String name_dep,
            String job_title_name) {
        this.id = id;
        this.idLogin = idLogin;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.birth_d = birth_d;
        this.entry_d = entry_d;
        this.login_user = login_user;
        this.password_user = password_user;
        this.mail_user = mail_user;
        this.role = role;
        this.personal_number = personal_number;
        this.work_number = work_number;
        this.location_street = location_street;
        this.cabinet_office = cabinet_office;
        this.name_dep = name_dep;
        this.job_title_name = job_title_name;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getIdLogin() {
        return idLogin;
    }
    public void setIdLogin(long idLogin) {
        this.idLogin = idLogin;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getMiddle_name() {
        return middle_name;
    }
    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public Date getBirth_d() {
        return birth_d;
    }
    public void setBirth_d(Date birth_d) {
        this.birth_d = birth_d;
    }
    public Date getEntry_d() {
        return entry_d;
    }
    public void setEntry_d(Date entry_d) {
        this.entry_d = entry_d;
    }
    public String getLogin_user() {
        return login_user;
    }
    public void setLogin_user(String login_user) {
        this.login_user = login_user;
    }
    public String getPassword_user() {
        return password_user;
    }
    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }
    public String getMail_user() {
        return mail_user;
    }
    public void setMail_user(String mail_user) {
        this.mail_user = mail_user;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public long getPersonal_number() {
        return personal_number;
    }
    public void setPersonal_number(long personal_number) {
        this.personal_number = personal_number;
    }
    public long getWork_number() {
        return work_number;
    }
    public void setWork_number(long work_number) {
        this.work_number = work_number;
    }
    public String getLocation_street() {
        return location_street;
    }
    public void setLocation_street(String location_street) {
        this.location_street = location_street;
    }
    public String getCabinet_office() {
        return cabinet_office;
    }
    public void setCabinet_office(String cabinet_office) {
        this.cabinet_office = cabinet_office;
    }
    public String getName_dep() {
        return name_dep;
    }
    public void setName_dep(String name_dep) {
        this.name_dep = name_dep;
    }
    public String getJob_title_name() {
        return job_title_name;
    }
    public void setJob_title_name(String job_title_name) {
        this.job_title_name = job_title_name;
    }

    @Override
    public String toString() {
        return "EmployeeFullView{" +
                "id=" + id +
                ", id_login=" + idLogin +
                ", first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_d=" + birth_d +
                ", entry_d=" + entry_d +
                ", login_user='" + login_user + '\'' +
                ", password_user='" + password_user + '\'' +
                ", mail_user='" + mail_user + '\'' +
                ", role='" + role + '\'' +
                ", work_number=" + work_number +
                ", personal_number=" + personal_number +
                ", location_street='" + location_street + '\'' +
                ", cabinet_office='" + cabinet_office + '\'' +
                ", name_dep='" + name_dep + '\'' +
                ", job_title_name='" + job_title_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeFullView that = (EmployeeFullView) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
