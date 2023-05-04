package com.epa.epadiplom.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "document", schema = "public", catalog = "EPA")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(insertable = false, updatable = false, name = "id_ls")
    private long idLs;
    @Column(name = "body_doc")
    private String bodyDoc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ls", nullable = false, insertable = false, updatable = false)
    private LogStatement logStatement;
}
