package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contact", schema = "public", catalog = "EPA")
public class Contact {

    //Columns in table Contact
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_main_info_contact")
    private long id_main_info_contact;
    private String location_street;
    private long work_number;
    private long personal_number;
    private String mail;


    //Connections of entities
    //Connection to entity Employee
    @OneToOne
    @JoinColumn(name = "id_main_info_contact")
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    // Getters, setters, constructors for Contact
    public Contact() {
    }
    public long getId() {
        return id_main_info_contact;
    }
    public void setId(long id_main_info_contact) {
        this.id_main_info_contact = id_main_info_contact;
    }
    public String getLocation_street() {
        return location_street;
    }
    public void setLocation_street(String location_street) {
        this.location_street = location_street;
    }
    public long getWork_number() {
        return work_number;
    }
    public void setWork_number(long work_number) {
        this.work_number = work_number;
    }
    public long getPersonal_number() {
        return personal_number;
    }
    public void setPersonal_number(long personal_number) {
        this.personal_number = personal_number;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }


    //Standard methods
    @Override
    public String toString() {
        return "Contact {" +
                "id_main_info_contact = " + id_main_info_contact +
                ", location_street = '" + location_street + '\'' +
                ", work_number = " + work_number +
                ", personal_number = " + personal_number +
                ", mail = '" + mail + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id_main_info_contact == contact.id_main_info_contact;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id_main_info_contact);
    }
}
