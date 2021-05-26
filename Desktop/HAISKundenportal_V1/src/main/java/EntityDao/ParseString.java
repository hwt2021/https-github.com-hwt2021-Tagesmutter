/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityDao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ws.rs.WebApplicationException;

/******************
 * @author t.nofal
 * 16.02.2021
 ******************/
public class ParseString {

    public ParseString() {
    }

    private DL parsePair(String[] pairToSplit) throws ParseException {

        DL dl = new DL();
        if (pairToSplit.length == 1) {
            if (!pairToSplit[0].isEmpty() && !pairToSplit[0].isBlank()) {
                dl.setID(Integer.parseInt(pairToSplit[0]));
            } else {
                dl.setID(0);
            }
            dl.setEND(new GregorianCalendar(4000, Calendar.JANUARY, 01).getTime());
        } else {
            if (!pairToSplit[0].isEmpty() && !pairToSplit[0].isBlank()) {
                dl.setID(Integer.parseInt(pairToSplit[0]));
            } else {
                dl.setID(0);
            }
            if (!pairToSplit[1].isEmpty() && !pairToSplit[1].isBlank()) {
                try {

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = sdf.parse(pairToSplit[1]);
                    dl.setEND(date);
                } catch (ParseException e) {
                    throw new WebApplicationException(404);
                }

            } else {
                dl.setEND(new GregorianCalendar(4000, Calendar.JANUARY, 01).getTime());
            }
        }

        return dl;
    }

    public List<DL> parseDBString(String source) throws ParseException {

        List<DL> listPair = new ArrayList<>();
        DL dl;
        // more pairs
        if (source.contains(",")) {
            String[] splittedArrayByComma = source.split(",");
            for (int i = 0; i < splittedArrayByComma.length; i++) {
                String[] pairToSplit = splittedArrayByComma[i].split(":");
                dl = parsePair(pairToSplit);
                listPair.add(dl);
            }
        } else {// only one Pair
            String[] singlePairToSplit = source.split(":");
            dl = parsePair(singlePairToSplit);
            listPair.add(dl);

        }
        return listPair;
    }

}
