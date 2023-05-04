package com.epa.epadiplom.entity.authentication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventRequest {

    private String typeOfEvent;
    private String commentFe;
    private Date dateOfEvent;

}
