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
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Calendar;

@Entity(name = "PublisherEntity")
@Table(name = "Publishers", indexes = {
        @Index(name = "Publishers_Names", columnList ="Publisher_Name")
})
public class Publisher implements Serializable
{
    private long id;
    private String name;
    private String address;
    private Calendar dateFounded;

    @SequenceGenerator(
      name="PUBLISHERS_SEQUENCE_GENERATOR",
      sequenceName="PUBLISHERS_SEQ"
    )
    @Id @GeneratedValue(generator="PUBLISHERS_SEQUENCE_GENERATOR")
    @TableGenerator(name = "PublisherGenerator", table = "Surrogate_Keys",
            pkColumnName = "Table_Name", pkColumnValue = "Publishers",
            valueColumnName = "Key_Value", initialValue = 11923,
            allocationSize = 1)
    @Column(name = "Publisher_Id")
    public long getId()
    {
        return this.id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "Publisher_Name", nullable = false)
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Basic
    @Column(nullable = false)
    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_FOUNDED")
    public Calendar getDateFounded()
    {
        return dateFounded;
    }

    public void setDateFounded(Calendar dateFounded)
    {
        this.dateFounded = dateFounded;
    }
}
