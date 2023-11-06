package com.amaris.employees.model.common;



import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class StringUtils {

    public static boolean isEmpty(String str){
        return str == null || str.isEmpty();
    }

    public static boolean isEmpty(String... strings){
        boolean empty = false;
        for(String str : strings){
            empty = empty || isEmpty(str);
        }
        return empty;
    }

    public static String localDateToDate(LocalDate date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormatReturn = "";
        if (date != null) {
            dateFormatReturn = format.format(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        }
        return dateFormatReturn;
    }

}
