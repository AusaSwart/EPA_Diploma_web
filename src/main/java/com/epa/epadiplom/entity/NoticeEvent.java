package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
