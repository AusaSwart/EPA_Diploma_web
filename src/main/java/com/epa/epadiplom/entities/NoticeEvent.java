package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "notice_event", schema = "public", catalog = "EPA")
public class NoticeEvent {

    //Columns in table NoticeEvent
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private long id_recipient;
    private long id_event;
    private long id_employee;


    //Connections of entities
    //Connection to entity Employee
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_employee", nullable = false, insertable = false, updatable = false)
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    //Connection to entity Event
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_event", nullable = false, insertable = false, updatable = false)
    private Event event;
    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }


    // Getters, setters, constructors for NoticeEvent
    public NoticeEvent(long id_recipient,
                       long id_event,
                       long id_employee) {
        this.id_recipient = id_recipient;
        this.id_event = id_event;
        this.id_employee = id_employee;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_recipient() {
        return id_recipient;
    }
    public void setId_recipient(long id_recipient) {
        this.id_recipient = id_recipient;
    }
    public long getId_event() {
        return id_event;
    }
    public void setId_event(long id_event) {
        this.id_event = id_event;
    }
    public long getId_employee() {
        return id_employee;
    }
    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
    }


    //Standard methods
    @Override
    public String toString() {
        return "NoticeEvent {" +
                "id_recipient = " + id_recipient +
                ", id_event = " + id_event +
                ", id_employee = " + id_employee +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoticeEvent that = (NoticeEvent) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
