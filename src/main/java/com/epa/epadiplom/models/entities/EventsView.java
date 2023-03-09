package com.epa.epadiplom.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.util.Date;
import java.util.Objects;

@Entity
@Immutable
@Getter
@NoArgsConstructor
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

    public EventsView(long id,
                      String type_of_event,
                      Date date_of_event,
                      String comment_fe,
                      long idRecipient,
                      long id_employee) {
        this.id = id;
        this.type_of_event = type_of_event;
        this.date_of_event = date_of_event;
        this.comment_fe = comment_fe;
        this.idRecipient = idRecipient;
        this.id_employee = id_employee;
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
    public Date getDate_of_event() {
        return date_of_event;
    }
    public void setDate_of_event(Date date_of_event) {
        this.date_of_event = date_of_event;
    }
    public String getComment_fe() {
        return comment_fe;
    }
    public void setComment_fe(String comment_fe) {
        this.comment_fe = comment_fe;
    }
    public long getId_recipient() {
        return idRecipient;
    }
    public void setId_recipient(long idRecipient) {
        this.idRecipient = idRecipient;
    }
    public long getId_employee() {
        return id_employee;
    }
    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventsView that = (EventsView) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "EventsView{" +
                "id=" + id +
                ", type_of_event='" + type_of_event + '\'' +
                ", date_of_event=" + date_of_event +
                ", comment_fe='" + comment_fe + '\'' +
                ", id_recipient=" + idRecipient +
                ", id_employee=" + id_employee +
                '}';
    }
}
