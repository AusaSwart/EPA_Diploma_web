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
@Table(name = "job_employee", schema = "public", catalog = "EPA")
public class JobEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(insertable = false, updatable = false, name = "id_employee")
    private long idEmployee;
    @Column(insertable = false, updatable = false, name = "id_job_title")
    private long idJobTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    private JobTitle jobTitle;
}
