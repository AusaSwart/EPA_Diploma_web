package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Employee {
    @Id
    private long id;
    private int privilege;
    private long id_dep;

    @OneToMany(mappedBy = "employee")
    private Set<EmployeeTask> employeeTasks = new HashSet<>();
    @OneToMany(mappedBy = "employee")
    private Set<NoticeEvent> noticeEvents = new HashSet<>();
    @OneToMany(mappedBy = "employee")
    private Set<JobEmployee> jobEmployees = new HashSet<>();
    @OneToMany(mappedBy = "employee")
    private Set<LogStatement> logStatements = new HashSet<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dep", nullable = false, insertable = false, updatable = false)
    private Department department;
    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Contact contact;
    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private MainInfo mainInfo;
    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Login login;

    public Employee() {
    }

    public Employee(int privilege, long id_dep, Set<Task> tasks) {
        this.privilege = privilege;
        this.id_dep = id_dep;
    }

    public Set<EmployeeTask> getEmployeeTasks() {
        return employeeTasks;
    }
    public void setEmployeeTasks(Set<EmployeeTask> employeeTasks) {
        this.employeeTasks = employeeTasks;
    }
    public Set<NoticeEvent> getNoticeEvents() {
        return noticeEvents;
    }
    public void setNoticeEvents(Set<NoticeEvent> noticeEvents) {
        this.noticeEvents = noticeEvents;
    }
    public Set<JobEmployee> getJobEmployees() {
        return jobEmployees;
    }
    public void setJobEmployees(Set<JobEmployee> jobEmployees) {
        this.jobEmployees = jobEmployees;
    }
    public Set<LogStatement> getLogStatements() {
        return logStatements;
    }
    public void setLogStatements(Set<LogStatement> logStatements) {
        this.logStatements = logStatements;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public Contact getContact() {
        return contact;
    }
    public void setContact(Contact contact) {
        this.contact = contact;
    }
    public MainInfo getMainInfo() {
        return mainInfo;
    }
    public void setMainInfo(MainInfo mainInfo) {
        this.mainInfo = mainInfo;
    }
    public Login getLogin() {
        return login;
    }
    public void setLogin(Login login) {
        this.login = login;
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
