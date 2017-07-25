package com.example.common;

/**
 * Created by solderedmachd on 7/25/17.
 */
public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER ("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String monthName;

    Month(String monthName){
        this.monthName = monthName;
    }
    private String englishName;

    public String getEnglishName() {
        this.englishName = monthName;
        return englishName;
    }


}
