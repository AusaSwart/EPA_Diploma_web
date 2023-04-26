package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees_view", schema = "public", catalog = "EPA")
public class EmployeesView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private long id_employee;
    private String first_name;
    private String middle_name;
    private String last_name;
    private long work_number;
    private String location_street;
    private String cabinet_office;
    private String name_dep;
    private String job_title_name;
}
