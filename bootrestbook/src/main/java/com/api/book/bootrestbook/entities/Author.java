package com.api.book.bootrestbook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {
    public Author() {
    }
    @Id
    private int authorId;
    private String firstname;
    private String lastname;
    public Author(int authorId, String firstname, String lastname) {
        this.authorId = authorId;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public String getFirstname() {
        return firstname;
    }
    @Override
    public String toString() {
        return "Author [authorId=" + authorId + ", firstname=" + firstname + ", lastname=" + lastname + "]";
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
