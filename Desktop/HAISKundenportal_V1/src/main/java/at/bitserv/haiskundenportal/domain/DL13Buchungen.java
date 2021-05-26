/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.bitserv.haiskundenportal.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author h.singh
 */
@Entity
@Table(name = "DL13_Buchungen", catalog = "hais_lgs", schema = "hais")

@NamedQueries({
    @NamedQuery(name = "DL13Buchungen.findAll", query = "SELECT d FROM DL13Buchungen d")
    ,@NamedQuery(name = "DL13Buchungen.findByVTid", query = "SELECT d FROM DL13Buchungen d where d.vt_id = :vt_id")})
@XmlRootElement(name="DL13Buchung")
public class DL13Buchungen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "vt_id")
    private Integer vt_id;
    @Size(max = 200)
    @Column(name = "langbezeichnung")
    private String langbezeichnung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dl")
    private int dl;
    @Size(max = 10)
    @Column(name = "tag")
    private String tag;

    public DL13Buchungen() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getVt_id() {
        return vt_id;
    }

    public void setVt_id(Integer vt_id) {
        this.vt_id = vt_id;
    }

    public String getLangbezeichnung() {
        return langbezeichnung;
    }

    public void setLangbezeichnung(String langbezeichnung) {
        this.langbezeichnung = langbezeichnung;
    }

    public int getDl() {
        return dl;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
}
