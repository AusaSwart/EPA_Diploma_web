package com.epa.epadiplom.entities;

import com.epa.epadiplom.entities.role.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "login", schema = "public", catalog = "EPA")
public class Login implements UserDetails {

    //Columns in table Login
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public Login(String login_user,
                 String password_user,
                 String mail_user) {
        this.login_user = login_user;
        this.password_user = password_user;
        this.mail_user = mail_user;
    }
    public long getId_main_info_login() {
        return id_main_info_login;
    }
    public void setId_main_info_login(long id_main_info_login) {
        this.id_main_info_login = id_main_info_login;
    }
    public String getMail_user() {
        return mail_user;
    }
    public void setMail_user(String mail_user) {
        this.mail_user = mail_user;
    }
    private String mail_user;
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
                ", mail_user = '" + mail_user + '\'' +
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


    // Security methods
    @Enumerated(EnumType.STRING)
    private Role role;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }
    @Override
    public String getPassword() {
        return password_user;
    }
    @Override
    public String getUsername() {
        return login_user;  // mb this is mail_user needed to be ids
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}
