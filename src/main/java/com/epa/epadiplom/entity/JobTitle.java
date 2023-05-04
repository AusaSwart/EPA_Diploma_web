package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "job_title", schema = "public", catalog = "EPA")
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "job_title_name")
    private String job_title_name;

    @OneToMany(mappedBy = "jobTitle")
    private Set<JobEmployee> jobEmployees = new LinkedHashSet<>();
}
