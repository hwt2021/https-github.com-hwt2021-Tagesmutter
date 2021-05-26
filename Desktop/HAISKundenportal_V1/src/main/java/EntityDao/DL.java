/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityDao;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * ****************
 * @author t.nofal 17.02.2021
 *****************
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DL implements Serializable {

    private static final long serialVersionUID = 1L;

    //@XmlAttribute
    private Integer ID;
    //@XmlElement
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private Date End;

    public void setID(Integer dlID) {
        this.ID = dlID;
    }

    public void setEND(Date dlEnde) {
        this.End = dlEnde;
    }

    public Integer getID() {
        return ID;
    }

    public Date getEND() {
        return End;
    }

}
