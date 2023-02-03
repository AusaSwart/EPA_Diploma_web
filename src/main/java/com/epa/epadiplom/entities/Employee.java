package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "employee", schema = "public", catalog = "EPA")
public class Employee {

    //Columns in table Employee
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private int privilege;
    @Column(insertable=false, updatable=false)
    private long id_dep;


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
    private Contact contact;
    public Contact getContact() {
        return contact;
    }
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    //Connection to entity MainInfo
    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private MainInfo mainInfo;
    public MainInfo getMainInfo() {
        return mainInfo;
    }
    public void setMainInfo(MainInfo mainInfo) {
        this.mainInfo = mainInfo;
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
    public Employee(int privilege, long id_dep) {
        this.privilege = privilege;
        this.id_dep = id_dep;
    }
    public Employee(int privilege, long id_dep, Set<Task> tasks) {
        this.privilege = privilege;
        this.id_dep = id_dep;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getPrivilege() {
        return privilege;
    }
    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }
    public long getId_dep() {
        return id_dep;
    }
    public void setId_dep(long id_dep) {
        this.id_dep = id_dep;
    }


    //Standard methods
    @Override
    public String toString() {
        return "Employee {" +
                "id = " + id +
                ", privilege = " + privilege +
                ", id_dep = " + id_dep +
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
