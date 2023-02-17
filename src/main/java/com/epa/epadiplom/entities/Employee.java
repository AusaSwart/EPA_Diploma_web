package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee", schema = "public", catalog = "EPA")
public class Employee {

    //Columns in table Employee
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(insertable=false, updatable=false)
    private long id_dep;
    private String first_name;
    private String middle_name;
    private String last_name;
    private long work_number;
    private String location_street;
    private String cabinet_office;


    //Connections of entities
    //Connection to entity Department
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dep")
    private Department department;
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    //Connection to entity LogStatement
    @OneToMany(mappedBy = "employee")
    private Set<LogStatement> logStatements = new LinkedHashSet<>();
    public Set<LogStatement> getLogStatements() {
        return logStatements;
    }
    public void setLogStatements(Set<LogStatement> logStatements) {
        this.logStatements = logStatements;
    }

    //Connection to entity Login
    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Login login;
    public Login getLogin() {
        return login;
    }
    public void setLogin(Login login) {
        this.login = login;
    }

    //Connection to entity Contact
    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Personal personal;
    public Personal getPersonal() {
        return personal;
    }
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    //Connection to entity JobEmployee
    @OneToMany(mappedBy = "employee")
    private Set<JobEmployee> jobEmployees = new LinkedHashSet<>();
    public Set<JobEmployee> getJobEmployees() {
        return jobEmployees;
    }
    public void setJobEmployees(Set<JobEmployee> jobEmployees) {
        this.jobEmployees = jobEmployees;
    }

    //Connection to entity NoticeEvent
    @OneToMany(mappedBy = "employee")
    private Set<NoticeEvent> noticeEvents = new LinkedHashSet<>();
    public Set<NoticeEvent> getNoticeEvents() {
        return noticeEvents;
    }
    public void setNoticeEvents(Set<NoticeEvent> noticeEvents) {
        this.noticeEvents = noticeEvents;
    }

    //Connection to entity EmployeeTask
    @OneToMany(mappedBy = "employee")
    private Set<EmployeeTask> employeeTasks = new LinkedHashSet<>();
    public Set<EmployeeTask> getEmployeeTasks() {
        return employeeTasks;
    }
    public void setEmployeeTasks(Set<EmployeeTask> employeeTasks) {
        this.employeeTasks = employeeTasks;
    }


    // Getters, setters, constructors for Employee
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_dep() {
        return id_dep;
    }
    public void setId_dep(long id_dep) {
        this.id_dep = id_dep;
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


    //Standard methods

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", id_dep=" + id_dep +
                ", first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", work_number=" + work_number +
                ", location_street='" + location_street + '\'' +
                ", cabinet_office='" + cabinet_office + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
