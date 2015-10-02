package com.wrox.site.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;

@Entity
@Table(name = "Books", uniqueConstraints = {
        @UniqueConstraint(name = "ISBN_UK", columnNames = { "Isbn" })
},
indexes = {
        @Index(name = "TITLE_IX", columnList = "Title")
})
public class Book implements Serializable
{
    private long id;
    private String isbn;
    private String title;
    private String author;
    private double price;
    private String publisher;

    @SequenceGenerator(
      name="BOOKS_SEQUENCE_GENERATOR",
      sequenceName="BOOKS_SEQ"
    )
    @Id @GeneratedValue(generator="BOOKS_SEQUENCE_GENERATOR")
    public long getId()
    {
        return this.id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    @Basic(optional = false)
    public String getIsbn()
    {
        return this.isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    @Basic(optional = false)
    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Basic(optional = false)
    public String getAuthor()
    {
        return this.author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Basic
    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Basic(optional = false)
    public String getPublisher()
    {
        return this.publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
}
