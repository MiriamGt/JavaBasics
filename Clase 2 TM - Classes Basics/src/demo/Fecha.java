package demo;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Fecha {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        System.out.println(date.getTime());
    }

    private String date;
    private String month;
    private String year;

    public Fecha(String date, String month, String year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "date='" + date + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public void increaseDate(Calendar date) {

    }
}
