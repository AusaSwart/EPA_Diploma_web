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
@Table(name = "events_view", schema = "public", catalog = "EPA")
public class EventsView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String type_of_event;
    private Date date_of_event;
    private String comment_fe;
    @Column(name = "id_recipient")
    private long idRecipient;
    private long id_employee;
}
