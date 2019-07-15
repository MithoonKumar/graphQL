package mithoon.graphQl.graphQL.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Table
@Entity
public class Book {

    @Id
    private String isn;
    private String title;
    private String publisher;
    private String[] authors;
    private String publishedDate;

    public Book() {
    }

    public Book(String isn, String title, String publisher, String[] authors, String publisedDate) {
        this.isn = isn;
        this.title = title;
        this.publisher = publisher;
        this.authors = authors;
        this.publishedDate = publisedDate;
    }
}
