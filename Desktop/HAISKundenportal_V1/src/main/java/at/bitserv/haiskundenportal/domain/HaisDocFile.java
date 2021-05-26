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
import javax.persistence.Lob;
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
@Table(name = "HaisDocFile", catalog = "hais_doc", schema = "hais")
@XmlRootElement(name="HaisDocFile")
@NamedQueries({
    @NamedQuery(name = "HaisDocFile.findAll", query = "SELECT h FROM HaisDocFile h")})
public class HaisDocFile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "id")
    private int id;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "file_base64")
    private String fileBase64;
    @Column(name = "partner_id_mitarbeiter")
    private Integer partnerIdMitarbeiter;
    @Column(name = "partner_id_kunde")
    private Integer partnerIdKunde;
    

    public HaisDocFile() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileBase64() {
        return fileBase64;
    }

    public void setFileBase64(String fileBase64) {
        this.fileBase64 = fileBase64;
    }

    public Integer getPartnerIdMitarbeiter() {
        return partnerIdMitarbeiter;
    }

    public void setPartnerIdMitarbeiter(Integer partnerIdMitarbeiter) {
        this.partnerIdMitarbeiter = partnerIdMitarbeiter;
    }

    public Integer getPartnerIdKunde() {
        return partnerIdKunde;
    }

    public void setPartnerIdKunde(Integer partnerIdKunde) {
        this.partnerIdKunde = partnerIdKunde;
    }
    
    
}
