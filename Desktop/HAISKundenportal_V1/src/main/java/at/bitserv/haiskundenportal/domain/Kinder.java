/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "Kinder", catalog = "hais_lgs", schema = "hais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kinder.findAll", query = "SELECT k FROM Kinder k")})
public class Kinder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Size(max = 80)
    @Column(name = "name_kind")
    private String nameKind;
    @Column(name = "gebdatum")
    @Temporal(TemporalType.DATE)
    private Date gebdatum;

    public Kinder() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer idk) {
        this.id = id;
    }

    public String getNameKind() {
        return nameKind;
    }

    public void setNameKind(String nameKind) {
        this.nameKind = nameKind;
    }

    public Date getGebdatum() {
        return gebdatum;
    }

    public void setGebdatum(Date gebdatum) {
        this.gebdatum = gebdatum;
    }
    
}
