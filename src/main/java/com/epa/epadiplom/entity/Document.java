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
@Table(name = "document", schema = "public", catalog = "EPA")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private long id_ls;
    private String body_doc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ls", nullable = false, insertable = false, updatable = false)
    private LogStatement logStatement;
}
