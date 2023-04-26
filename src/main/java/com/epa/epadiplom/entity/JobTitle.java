package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_title", schema = "public", catalog = "EPA")
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String job_title_name;

    @OneToMany(mappedBy = "jobTitle")
    private Set<JobEmployee> jobEmployees = new LinkedHashSet<>();
}
