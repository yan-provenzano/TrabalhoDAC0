/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.beans.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.Serializable;

/**
 *
 * @author Yan
 */
public class ClockBean implements Serializable {
    
    public ClockBean() {
      
    }
      
    public String getReadableDate() {
        Date now = new Date();
        Locale mylocale = new Locale("pt", "BR");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy (EEEEEEEEEEEEE) - HH:mm aa", mylocale);
        String today = sdf.format(now);
        today += ("");
        return today;
    }
}
