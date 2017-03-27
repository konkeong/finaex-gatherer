/*
 * 2017-03-27 13:52:33.726
 */
package org.gnoeknok.finaex.gatherer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ethan Lee Kon Keong
 */
@Entity
@Table(name = "`t_city`")
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", nullable = false)
    private Long id;

    @Column(name = "`name`", nullable = false)
    private String name;

    @Column(name = "`state`", nullable = false)
    private String state;

    @Column(name = "`country`", nullable = false)
    private String country;

    public City() {
        this(null, null, null, null);
    }

    public City(Long id, String name, String state, String country) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getName());
        sb.append("@{");
        int added = 0;
        if (id != null) {
            sb.append(added++ > 0 ? ", " : "").append("id=").append(id);
        }
        if (name != null) {
            sb.append(added++ > 0 ? ", " : "").append("name=").append(name);
        }
        if (state != null) {
            sb.append(added++ > 0 ? ", " : "").append("state=").append(state);
        }
        if (country != null) {
            sb.append(added++ > 0 ? ", " : "").append("country=").append(country);
        }
        sb.append('}');
        return sb.toString();
    }

}
