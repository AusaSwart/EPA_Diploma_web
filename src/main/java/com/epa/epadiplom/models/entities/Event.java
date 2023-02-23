package com.epa.epadiplom.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "event", schema = "public", catalog = "EPA")
public class Event {

    //Columns in table Event
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String type_of_event;
    private String comment_fe;
    private Date date_of_event;


    //Connections of entities
    //Connection to entity NoticeEvent
    @OneToMany(mappedBy = "event")
    private Set<NoticeEvent> noticeEvents = new LinkedHashSet<>();
    public Set<NoticeEvent> getNoticeEvents() {
        return noticeEvents;
    }
    public void setNoticeEvents(Set<NoticeEvent> noticeEvents) {
        this.noticeEvents = noticeEvents;
    }


    // Getters, setters, constructors for Event
    public Event(String type_of_event,
                 String comment_fe,
                 Date date_of_event) {
        this.type_of_event = type_of_event;
        this.comment_fe = comment_fe;
        this.date_of_event = date_of_event;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getType_of_event() {
        return type_of_event;
    }
    public void setType_of_event(String type_of_event) {
        this.type_of_event = type_of_event;
    }
    public String getComment_fe() {
        return comment_fe;
    }
    public void setComment_fe(String comment_fe) {
        this.comment_fe = comment_fe;
    }
    public Date getDate_of_event() {
        return date_of_event;
    }
    public void setDate_of_event(Date date_of_event) {
        this.date_of_event = date_of_event;
    }


    //Standard methods
    @Override
    public String toString() {
        return "Event {" +
                "id = " + id +
                ", type_of_event = '" + type_of_event + '\'' +
                ", comment_fe = '" + comment_fe + '\'' +
                ", date_of_event = " + date_of_event +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
