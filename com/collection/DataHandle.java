package com.collection;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataHandle {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.DATE)+" "+(cal.get(Calendar.MONTH)+1)+" "+cal.get(Calendar.YEAR));

        SimpleDateFormat sdf = new SimpleDateFormat(" E dd mm yyyy HH:mm:ss a");
        String mydate = sdf.format(cal.getTime());
        System.out.println(mydate);
        if(mydate.length()>10){
            System.out.println("Large data");
        }
    }


}
