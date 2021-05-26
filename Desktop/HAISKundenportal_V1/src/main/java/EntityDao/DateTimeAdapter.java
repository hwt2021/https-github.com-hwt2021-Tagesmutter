/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityDao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author t.nofal
 */
public class DateTimeAdapter extends XmlAdapter<String, Date> {

    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    
    @Override
    public Date unmarshal(String xml) throws Exception {
        return dateFormat.parse(xml);
    }

    @Override 
    public String marshal(Date object) throws Exception {
        return dateFormat.format(object);
    }
}

