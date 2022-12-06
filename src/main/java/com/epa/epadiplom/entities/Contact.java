package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @Column(name = "id_main_info_contact")
    private long id_main_info_contact;
    private String location_street;
    private long work_number;
    private long personal_number;
    private String mail;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_main_info_contact")
    private Employee employee;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_main_info_contact")
    private MainInfo mainInfo;

    public Contact() {
    }

    public long getId() {
        return id_main_info_contact;
    }
    public void setId(long id_main_info_contact) {
        this.id_main_info_contact = id_main_info_contact;
    }
    public String getLocationStreet() {return location_street;}
    public void setLocationStreet(String location_street) {
        this.location_street = location_street;
    }
    public long getWorkNumber() {return work_number;}
    public void setWorkNumber(long work_number) {
        this.work_number = work_number;
    }
    public long getPersonalNumber() {return personal_number;}
    public void setPersonalNumber(long personal_number) {
        this.personal_number = personal_number;
    }
    public String getMail() {return mail;}
    public void setMail(String mail) {
        this.mail = mail;
    }

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
