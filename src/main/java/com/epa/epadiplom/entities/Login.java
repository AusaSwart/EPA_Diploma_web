package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "login")
public class Login {

    //Columns in table Login
    @Id
    @Column(name = "id_main_info_login")
    private long id_main_info_login;
    private String login_user;
    private String password_user;


    //Connections of entities
    //Connection to entity Employee
    @OneToOne
    @JoinColumn(name = "id_main_info_login")
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    // Getters, setters, constructors for Login
    public Login() {
    }
    public long getId() {
        return id_main_info_login;
    }
    public void setId(long id_main_info_login) {
        this.id_main_info_login = id_main_info_login;
    }
    public String getLogin_user() {
        return login_user;
    }
    public void setLogin_user(String login_user) {
        this.login_user = login_user;
    }
    public String getPassword_user() {
        return password_user;
    }
    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }


    //Standard methods
    @Override
    public String toString() {
        return "Login {" +
                "id_main_info_login = " + id_main_info_login +
                ", login_user = '" + login_user + '\'' +
                ", password_user = '" + password_user + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return id_main_info_login == login.id_main_info_login;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id_main_info_login);
    }
}
