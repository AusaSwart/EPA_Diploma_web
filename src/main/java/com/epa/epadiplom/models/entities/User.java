package com.epa.epadiplom.models.entities;

import com.epa.epadiplom.models.entities.employeeAttributes.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "login", schema = "public", catalog = "EPA")
public class User implements UserDetails {

    //Columns in table Login(User)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_login")
    private long id_login;
    @Column(name = "login_user")
    private String firstName;
    @Column(name = "password_user")
    private String password;
    @Column(name = "mail_user")
    private String mail; // firstName
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
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public String getUsername() {
        return firstName;
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
