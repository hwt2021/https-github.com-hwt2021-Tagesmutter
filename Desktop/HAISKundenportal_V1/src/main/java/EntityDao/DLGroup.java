/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityDao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/*********************
 * @author t.nofal
 * 17.02.2021
 **********************/
@XmlRootElement(name ="DLs")
public class DLGroup implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private List<DL> dl_List = new ArrayList<>();
    
    public List<DL> getDL() {
        return dl_List;
    }
 
    public void setDL(List<DL> dl_List) {
        this.dl_List = dl_List;
    }
    
}
