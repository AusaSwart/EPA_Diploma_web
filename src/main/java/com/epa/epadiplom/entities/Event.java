package com.epa.epadiplom.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

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
    private List<NoticeEvent> noticeEvents;

    public Event() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Object getTypeOfEvent() {return type_of_event;}
    public void setTypeOfEvent(String type_of_event) {
        this.type_of_event = type_of_event;
    }
    public Object getCommentFE() {return comment_fe;}
    public void setCommentFE(String comment_fe) { this.comment_fe = comment_fe; }
    public Object getDateOfEvent() {
        return date_of_event;
    }
    public void setDateOfEvent(Date date_of_event) {
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
