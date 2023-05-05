package com.epa.epadiplom.entity.authentication;

import lombok.*;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventRequest {

    private String typeOfEvent;
    private String commentFe;
    private Date dateOfEvent;
//    private long recipientId;

}
