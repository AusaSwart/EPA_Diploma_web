package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "main_info")
public class MainInfo {

    //Columns in table MainInfo
    @Id
    @Column(name = "id_main_info")
    private long id_main_info;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String cabinet_office;
    private Date birth_d;
    private Date entry_d;


    //Connections of entities
    //Connection to entity Employee
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id_main_info")
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    // Getters, setters, constructors for MainInfo
    public MainInfo() {
    }
    public long getId() {
        return id_main_info;
    }
    public void setId(long id_main_info) {
        this.id_main_info = id_main_info;
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
    public String getCabinet_office() {
        return cabinet_office;
    }
    public void setCabinet_office(String cabinet_office) {
        this.cabinet_office = cabinet_office;
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


    //Standard methods
    @Override
    public String toString() {
        return "MainInfo {" +
                "id_main_info = " + id_main_info +
                ", first_name = '" + first_name + '\'' +
                ", middle_name = '" + middle_name + '\'' +
                ", last_name = '" + last_name + '\'' +
                ", cabinet_office = '" + cabinet_office + '\'' +
                ", birth_d = " + birth_d +
                ", entry_d = " + entry_d +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainInfo mainInfo = (MainInfo) o;
        return id_main_info == mainInfo.id_main_info;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id_main_info);
    }
}
