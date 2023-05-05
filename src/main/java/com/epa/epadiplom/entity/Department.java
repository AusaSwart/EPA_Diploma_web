package com.epa.epadiplom.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//To suppress serializing properties with null values
@JsonSerialize
//Ignoring new fields on JSON objects
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "department", schema = "public", catalog = "EPA")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name_dep")
    private String nameDep;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employees = new LinkedHashSet<>();
}
