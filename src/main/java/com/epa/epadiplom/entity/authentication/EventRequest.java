package com.epa.epadiplom.entity.authentication;

import lombok.*;

import java.sql.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EventRequest {

    private String typeOfEvent;
    private String commentFe;
    private Date dateOfEvent;
    private long recipientId;

}
