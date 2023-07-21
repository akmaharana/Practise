package com.practices;

public class Date_Class {
    public static void main(String[] args) {
        java.util.Date d1 = new java.util.Date();
        System.out.println("Date is: " + d1);
        long a = d1.getTime();
        java.sql.Date sd1 = new java.sql.Date(a);
        System.out.println("SQL Date Is: " + sd1);
    }
}
