package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.Employee;
import com.epa.epadiplom.entity.User;
import com.epa.epadiplom.entity.authentication.AuthenticationRequest;
import com.epa.epadiplom.entity.authentication.AuthenticationResponse;
import com.epa.epadiplom.entity.authentication.RegisterRequest;
import com.epa.epadiplom.entity.employeeAttributes.Role;
import com.epa.epadiplom.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserService userService;
    private final EmployeeService employeeService;
    private final PasswordEncoder passwordEncoder;
    private  final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final EmployeeRepository employeeRepository;

    public AuthenticationResponse register(RegisterRequest request) {
//        Employee employee = Employee.builder()
//                .id_dep(999)
//                .firstName("none")
//                .middle_name("none")
//                .last_name("none")
//                .work_number(000)
//                .location_street("none")
//                .cabinet_office("0/000")
//                .build();
//        employeeRepository.save(employee);
        Employee employee = employeeRepository
                .findByFirstNameAndMiddleNameAndLastName(
                        request.getFirstName(),
                        request.getMiddleName(),
                        request.getLastName()).orElse(new Employee());
        var user = User.builder()
                .idLogin(employee.getId())
                .firstName(request.getLogin())
                .mail(request.getMail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        userService.saveUser(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getLogin(), request.getPassword()));
        var user = userService.findUserByFirstName(request.getLogin());
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
