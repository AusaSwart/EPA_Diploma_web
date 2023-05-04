package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "job_title_view", schema = "public", catalog = "EPA")
public class JobTitleView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "id_employee")
    private long idEmployee;
    @Column(name = "job_title_name")
    private String jobTitleName;

}
