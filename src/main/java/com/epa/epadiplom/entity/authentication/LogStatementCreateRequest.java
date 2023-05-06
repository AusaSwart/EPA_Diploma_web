package com.epa.epadiplom.entity.authentication;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogStatementCreateRequest {

    private long idApprover;
    private String commentLs;
    private int daysSum;
    private int typeLeave;
    private Date dateLeave;
    private Date dateOfLs;
    private String bodyDoc;

}
