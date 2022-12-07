package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @Column(name = "id")
    private long id;
    private String type_of_event;
    private String comment_fe;
    private Date date_of_event;

    @OneToMany(mappedBy = "event")
    private Set<NoticeEvent> noticeEvents = new HashSet<>();

    public Event() {
    }

    public Set<NoticeEvent> getNoticeEvents() {
        return noticeEvents;
    }
    public void setNoticeEvents(Set<NoticeEvent> noticeEvents) {
        this.noticeEvents = noticeEvents;
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
