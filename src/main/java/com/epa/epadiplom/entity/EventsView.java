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
@Table(name = "events_view", schema = "public", catalog = "EPA")
public class EventsView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "type_of_event")
    private String typeOfEvent;
    @Column(name = "date_of_event")
    private Date dateOfEvent;
    @Column(name = "comment_fe")
    private String commentFe;
    @Column(name = "id_recipient")
    private long idRecipient;
    @Column(name = "id_employee")
    private long idEmployee;
}
