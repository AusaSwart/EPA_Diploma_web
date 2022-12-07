package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "notice_event")
public class NoticeEvent {
    @Id
    @Column(name = "id")
    private long id;
    private long id_recipient;
    private long id_event;
    private long id_employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee", nullable = false, insertable = false, updatable = false)
    private Employee employee;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_event", nullable = false, insertable = false, updatable = false)
    private Event event;

    public NoticeEvent() {
    }

    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
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
