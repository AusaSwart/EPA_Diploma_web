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
public class TaskRequest {

    private Date dateTask;
    private String nameOfTask;
    private String commentTe;
    private long idExecutor;

}
