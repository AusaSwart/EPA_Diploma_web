package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "main_info")
public class MainInfo {
    @Id
    @Column(name = "id_main_info")
    private long id_main_info;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String cabinet_office;
    private Date birth_d;
    private Date entry_d;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_main_info")
    private Employee employee;

    @OneToOne(mappedBy = "mainInfo", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Contact contact;

    @OneToOne(mappedBy = "mainInfo", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Login login;

    public MainInfo() {
    }

    public long getId() { return id_main_info; }
    public void setId(long id_main_info) { this.id_main_info = id_main_info; }
    public String getFirstName() { return first_name;}
    public void setFirstName(String first_name) { this.first_name = first_name; }
    public String getMiddleName() {return middle_name;}
    public void setMiddleName(String middle_name) { this.middle_name = middle_name; }
    public String getLastName() { return last_name;}
    public void setLastName(String last_name) { this.last_name = last_name; }
    public String getCabinetOffice() {return cabinet_office;}
    public void setCabinetOffice(String cabinet_office) { this.cabinet_office = cabinet_office; }
    public Date getBirthD() { return birth_d;}
    public void setBirthD(Date birth_d) { this.birth_d = birth_d; }
    public Date getEntryD() { return entry_d; }
    public void setEntryD(Date entry_d) { this.entry_d = entry_d; }

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
