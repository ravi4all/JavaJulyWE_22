package OOPS;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class CommonUtils {

    // Locale locale = new Locale("en","US");
    ResourceBundle rb = ResourceBundle.getBundle("constant");
    Locale locale = new Locale(rb.getString("localeFormat"), 
    rb.getString("localeCountry"));

    public String getProperName(String name) {
        String properName = "";
        // name = "virat kohli"
        String nameArr[] = name.split(" ");    // ["virat", "kohli"]
        for(String n : nameArr) {
            properName += String.valueOf(n.charAt(0)).toUpperCase() + n.substring(1).toLowerCase() + " ";
        }
        return properName;
    }

    public String dateFormat(){
        Date date = new Date();
        // DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        String formatDate = df.format(date);
        return formatDate;
    }

    public String formatSalary(double salary) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String formatSal = nf.format(salary);
        return formatSal;
    }
}
