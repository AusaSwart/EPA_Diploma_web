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
@Table(name = "event", schema = "public", catalog = "EPA")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String type_of_event;
    private String comment_fe;
    private Date date_of_event;

    @OneToMany(mappedBy = "event")
    private Set<NoticeEvent> noticeEvents = new LinkedHashSet<>();
}
