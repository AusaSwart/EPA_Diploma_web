package com.epa.epadiplom.entities;

import com.epa.epadiplom.entities.employeeAttributes.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "login", schema = "public", catalog = "EPA")
public class Login implements UserDetails {

    //Columns in table Login
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_login")
    private long id_login;
    @Column(name = "login_user")
    private String login;
    @Column(name = "password_user")
    private String password;
    @Column(name = "mail_user")
    private String mail;
    @Enumerated(EnumType.STRING)
    private Role role;
//    private final List<SimpleGrantedAuthority> authorities;
//    private final boolean isActive;

    //Connections of entities
    //Connection to entity Employee
    @OneToOne
    @JoinColumn(name = "id_login")
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // Security methods

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
        //return authorities;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public String getUsername() {
        return login;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
        //return isActive;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
        //return isActive;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
        //return isActive;
    }
    @Override
    public boolean isEnabled() {
        return true;
        //return isActive;
    }

//    public static UserDetails fromLogin(Login login) {
//        return new org.springframework.security.core.userdetails.User(
//                login.getLogin(), login.getPassword(),
//                login.getRole().getAuthorities()
//        );
//    }

}
