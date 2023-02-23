package com.epa.epadiplom.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "document", schema = "public", catalog = "EPA")
public class Document {

    //Columns in table Document
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private long id_ls;
    private String body_doc;


    //Connections of entities
    //Connection to entity LogStatement
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ls", nullable = false, insertable = false, updatable = false)
    private LogStatement logStatement;
    public LogStatement getLogStatement() {
        return logStatement;
    }
    public void setLogStatement(LogStatement logStatement) {
        this.logStatement = logStatement;
    }


    // Getters, setters, constructors for Document
    public Document(long id_ls,
                    String body_doc) {
        this.id_ls = id_ls;
        this.body_doc = body_doc;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_ls() {
        return id_ls;
    }
    public void setId_ls(long id_ls) {
        this.id_ls = id_ls;
    }
    public String getBody_doc() {
        return body_doc;
    }
    public void setBody_doc(String body_doc) {
        this.body_doc = body_doc;
    }


    //Standard methods
    @Override
    public String toString() {
        return "Document {" +
                "id = " + id +
                ", id_ls = " + id_ls +
                ", body_doc = '" + body_doc + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return id == document.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
