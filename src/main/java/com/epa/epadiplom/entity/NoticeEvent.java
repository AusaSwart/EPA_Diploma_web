package com.epa.epadiplom.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

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
@Table(name = "notice_event", schema = "public", catalog = "EPA")
public class NoticeEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "id_recipient")
    private long recipientId;
    @Column(insertable = false, updatable = false, name = "id_event")
    private long eventId;
    @Column(insertable = false, updatable = false, name = "id_employee")
    private long employeeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_event")
    private Event event;
}
