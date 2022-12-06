package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id")

    private long id;
    private int privilege;
    private long id_dep;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeTask> employeeTasks;

    @OneToMany(mappedBy = "employee")
    private List<NoticeEvent> noticeEvents;

    @OneToMany(mappedBy = "employee")
    private List<JobEmployee> jobEmployees;

    @OneToMany(mappedBy = "employee")
    private List<LogStatement> logStatements;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dep")
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
    public long getIdDep() {
        return id_dep;
    }
    public void setIdDep(long id_dep) {
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
