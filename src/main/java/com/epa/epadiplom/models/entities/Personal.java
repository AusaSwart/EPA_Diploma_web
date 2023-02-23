package com.epa.epadiplom.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Objects;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personal", schema = "public", catalog = "EPA")
public class Personal {

    //Columns in table Personal
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personal")
    private long id_personal;
    private long personal_number;
    private Date birth_d;
    private Date entry_d;


    //Connections of entities
    //Connection to entity Employee
    @OneToOne
    @JoinColumn(name = "id_personal")
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    // Getters, setters, constructors for Contact
    public long getId_personal() {
        return id_personal;
    }
    public void setId_personal(long id_personal) {
        this.id_personal = id_personal;
    }
    public long getPersonal_number() {
        return personal_number;
    }
    public void setPersonal_number(long personal_number) {
        this.personal_number = personal_number;
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
        return "Personal{" +
                "id_personal=" + id_personal +
                ", personal_number=" + personal_number +
                ", birth_d=" + birth_d +
                ", entry_d=" + entry_d +
                ", employee=" + employee +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personal personal = (Personal) o;
        return id_personal == personal.id_personal;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id_personal);
    }
}
