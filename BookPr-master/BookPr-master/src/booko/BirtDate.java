/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booko;

/**
 *
 * @author jawwal
 */
public class BirtDate {
   private int day;
   private int month;
   private int year;

    public BirtDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day =  (day>=1 && day <=30) ? day : 1;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month>=1 && month <=12 ? month : 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

   
    public String getBirthDate() {
        return day + "/" + month + "/" + year ;
    }
   
    
    
}
