package com.epa.epadiplom.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
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
@Table(name = "log_statement", schema = "public", catalog = "EPA")
public class LogStatement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(insertable = false, updatable = false, name = "id_employee")
    private long idEmployee;
    @Column(name = "id_approver")
    private long idApprover;
    @Column(name = "comment_ls")
    private String commentLs;
    @Column(name = "days_sum")
    private int daysSum;
    @Column(name = "type_leave")
    private int typeLeave;
    private int status;
    @Column(name = "date_leave")
    private Date dateLeave;
    @Column(name = "date_of_ls")
    private Date dateOfLs;

    @OneToMany(mappedBy = "logStatement")
    private Set<Document> documents = new LinkedHashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;

}
