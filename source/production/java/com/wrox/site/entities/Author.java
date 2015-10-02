package com.wrox.site.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Authors", indexes = {
        @Index(name = "AUTHOR_NAME_IX", columnList = "AUTHOR_NAME")
})
public class Author implements Serializable
{
    private long id;
    private String name;
    private String emailAddress;

    @SequenceGenerator(
      name="AUTHORS_SEQUENCE_GENERATOR",
      sequenceName="AUTHORS_SEQ"
    )
    @Id @GeneratedValue(generator="AUTHORS_SEQUENCE_GENERATOR")
    @Column(name = "AUTHOR_ID")
    public long getId()
    {
        return this.id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "AUTHOR_NAME")
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Basic
    @Column(name = "EMAIL_ADDRESS")
    public String getEmailAddress()
    {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
}
