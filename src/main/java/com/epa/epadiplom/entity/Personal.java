package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "personal", schema = "public", catalog = "EPA")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personal")
    private long idPersonal;
    @Column(name = "personal_number")
    private long personalNumber;
    @Column(name = "birth_d")
    private Date birthD;
    @Column(name = "entry_d")
    private Date entryD;

    @OneToOne
    @JoinColumn(name = "id_personal")
    private Employee employee;
}
