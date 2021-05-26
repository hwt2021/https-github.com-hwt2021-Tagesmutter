/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityDao;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/******************
 * @author t.nofal
 * 17.02.2021
 ******************/
@XmlRootElement
public class User implements Serializable{
    private static final long serialVersionUID = 1L;

    private String anrede;
    //@ElementCollection
    //@OrderColumn
    //@OrderBy (value =  "ID")
    //private List<DL> DL;
    private DLGroup DL;
    private String expression;
    private Date geburtsdatum;
    private Integer HDL;
    private Integer id;
    private Integer kundenID;
    private String passwort;
    private String vorname;
    private String zuname;

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public void setDLs(DLGroup Dl) {
        this.DL = Dl;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public void setHDL(Integer HDL) {
        this.HDL = HDL;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setKundenID(Integer kundenID) {
        this.kundenID = kundenID;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setZuname(String zuname) {
        this.zuname = zuname;
    }

    public String getAnrede() {
        return anrede;
    }

    public DLGroup getDLs() {
        return DL;
    }

    public String getExpression() {
        return expression;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public Integer getHDL() {
        return HDL;
    }

    public Integer getId() {
        return id;
    }

    public Integer getKundenID() {
        return kundenID;
    }

    public String getPasswort() {
        return passwort;
    }

    public String getVorname() {
        return vorname;
    }

    public String getZuname() {
        return zuname;
    }

}
