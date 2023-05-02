package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "log_statement", schema = "public", catalog = "EPA")
public class LogStatement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private long id_employee;
    private long id_approver;
    private String comment_ls;
    private int days_sum;
    private int type_leave;
    private int status;
    private Date date_leave;
    private Date date_of_ls;

    @OneToMany(mappedBy = "logStatement")
    private Set<Document> documents = new LinkedHashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;
}
