package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personal", schema = "public", catalog = "EPA")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personal")
    private long id_personal;
    private long personal_number;
    private Date birth_d;
    private Date entry_d;

    @OneToOne
    @JoinColumn(name = "id_personal")
    private Employee employee;
}
