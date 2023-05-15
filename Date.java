/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan3_2;

/**
 *
 * @author Admin
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day= 21;
        this.month= 01;
        this.year=2003;
    }

   

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(String date){
        String[] arrDate= date.split("/");
        this.day = Integer.parseInt(arrDate[0]);
        this.month = Integer.parseInt(arrDate[1]);
        this.year = Integer.parseInt(arrDate[2]);
    }

    public int getDay() {
        return day;
    }

    public Date setDay(int day) {
        this.day = day;
        return this;
    }

    public int getMonth() {
        return month;
    }

    public Date setMonth(int month) {
        this.month = month;
         return this;
    }

    public int getYear() {
        return year;
    }

    public Date setYear(int year) {
        this.year = year;
         return this;
    }
   
    public boolean  checkDay(int day){
       return day ==this.day;
    }
   public boolean  checkMonth(int month)
   {
       return month == this.month;
   }   
   public boolean checkYear(int year){
       return  year == this.year;
       }
}
