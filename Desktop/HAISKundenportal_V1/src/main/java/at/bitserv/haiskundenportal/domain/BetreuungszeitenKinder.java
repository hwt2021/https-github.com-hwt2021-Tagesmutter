/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "BetreuungszeitenKinder", catalog = "hais_lgs", schema = "hais")
@NamedQueries({
    @NamedQuery(name = "BetreuungszeitenKinder.findAll", query = "SELECT b FROM BetreuungszeitenKinder b")})
public class BetreuungszeitenKinder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Id
    @NotNull
    @Column(name = "id")
    private int id;
    @NotNull
    @Column(name = "vt_id")
    private int vtId;
    @Size(max = 10)
    @Column(name = "tag")
    private String tag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "von")
    @Temporal(TemporalType.TIME)
    private Date von;
    @Column(name = "bis")
    @Temporal(TemporalType.TIME)
    private Date bis;

    public BetreuungszeitenKinder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVtId() {
        return vtId;
    }

    public void setVtId(int vtId) {
        this.vtId = vtId;
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getVon() {
        return von;
    }

    public void setVon(Date von) {
        this.von = von;
    }

    public Date getBis() {
        return bis;
    }

    public void setBis(Date bis) {
        this.bis = bis;
    }
    
}
