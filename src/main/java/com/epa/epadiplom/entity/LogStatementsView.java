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
@Table(name = "ls_view", schema = "public", catalog = "EPA")
public class LogStatementsView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private int type_leave;
    private Date date_of_ls;
    private int days_sum;
    @Column(name = "id_approver")
    private long idApprover;
    private int approve;
    private String comment_ls;
    private long id_employee;
    private String body_doc;
    private String role;
}
