package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "login")
public class Login {
    @Id
    @Column(name = "id_main_info_login")
    private long id_main_info_login;
    private String login_user;
    private String password_user;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_main_info_login")
    private Employee employee;
    @OneToOne
    @MapsId
    @JoinColumn(name = "id_main_info_login")
    private MainInfo mainInfo;

    public Login() {
    }

    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public MainInfo getMainInfo() {
        return mainInfo;
    }
    public void setMainInfo(MainInfo mainInfo) {
        this.mainInfo = mainInfo;
    }
    public long getId() {
        return id_main_info_login;
    }
    public void setId(long id_main_info_login) {
        this.id_main_info_login = id_main_info_login;
    }
    public String getLoginUser() {return login_user;}
    public void setLoginUser(String login_user) {
        this.login_user = login_user;
    }
    public String getPasswordUser() {return password_user;}
    public void setPasswordUser(String password_user) {
        this.password_user = password_user;
    }

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
