package com.epa.epadiplom.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

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
@Table(name = "ls_view", schema = "public", catalog = "EPA")
public class LogStatementsView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "type_leave")
    private int typeLeave;
    @Column(name = "date_of_ls")
    private Date dateOfLs;
    @Column(name = "days_sum")
    private int daysSum;
    @Column(name = "id_approver")
    private long idApprover;
    private int status;
    @Column(name = "comment_ls")
    private String commentLs;
    @Column(name = "id_employee")
    private long idEmployee;
    @Column(name = "body_doc")
    private String bodyDoc;
    private String role;
}
