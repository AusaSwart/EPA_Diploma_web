package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;
import java.util.Objects;

@Entity
@Immutable
@Getter
@NoArgsConstructor
@Table(name = "employees_view", schema = "public", catalog = "EPA")
public class EmployeesView {

    //Columns in table EmployeesView
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private long id_employee;
    private String first_name;
    private String middle_name;
    private String last_name;
    private long work_number;
    private String location_street;
    private String cabinet_office;
    private String name_dep;
    private String job_title_name;


// Getters, setters, constructors for EmployeesVie
    public EmployeesView(long id,
                         long id_employee,
                         String first_name,
                         String middle_name,
                         String last_name,
                         long work_number,
                         String location_street,
                         String cabinet_office,
                         String name_dep,
                         String job_title_name) {
        this.id = id;
        this.id_employee = id_employee;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
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
    public long getId_employee() {
        return id_employee;
    }
    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesView that = (EmployeesView) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return "EmployeesView{" +
                "id=" + id +
                ", id_employee=" + id_employee +
                ", first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", work_number=" + work_number +
                ", location_street='" + location_street + '\'' +
                ", cabinet_office='" + cabinet_office + '\'' +
                ", name_dep='" + name_dep + '\'' +
                ", job_title_name='" + job_title_name + '\'' +
                '}';
    }
}
