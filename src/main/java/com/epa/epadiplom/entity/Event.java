package com.epa.epadiplom.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

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
@Table(name = "event", schema = "public", catalog = "EPA")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "type_of_event")
    private String typeOfEvent;
    @Column(name = "comment_fe")
    private String commentFe;
    @Column(name = "date_of_event")
    private Date dateOfEvent;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
    private Set<NoticeEvent> noticeEvents = new LinkedHashSet<>();
}
