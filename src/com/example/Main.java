package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

import com.example.common.Month.*;

public class Main {

    public static void main(String[] args) {

        for (Month name : Month.values()) {
            System.out.println(name.getEnglishName());
        }



        Scanner scannerInput = new Scanner(System.in);

        System.out.println("Enter a Month");

        String input = scannerInput.nextLine();
        System.out.println(input);


        input = input.toUpperCase();
        Month inputEnum = Month.valueOf(input);
        switchMonths(inputEnum);
    }

    public static String switchMonths(Month inputEnum) {
        ArrayList<String> monthList = new ArrayList();

        switch (inputEnum) {
            case JANUARY:
                monthList.add(Month.JANUARY.getEnglishName());
            case FEBRUARY:
                monthList.add(Month.FEBRUARY.getEnglishName());
            case MARCH:
                monthList.add(Month.MARCH.getEnglishName());
            case APRIL:
                monthList.add(Month.APRIL.getEnglishName());
            case MAY:
                monthList.add(Month.MAY.getEnglishName());
            case JUNE:
                monthList.add(Month.JUNE.getEnglishName());
            case JULY:
                monthList.add(Month.JULY.getEnglishName());
            case AUGUST:
                monthList.add(Month.AUGUST.getEnglishName());
            case SEPTEMBER:
                monthList.add(Month.SEPTEMBER.getEnglishName());
            case OCTOBER:
                monthList.add(Month.OCTOBER.getEnglishName());
            case NOVEMBER:
                monthList.add(Month.NOVEMBER.getEnglishName());
            case DECEMBER:
                monthList.add(Month.DECEMBER.getEnglishName());
            default:
                System.out.println("The following months are a sequential list of the months that follow your selection, because that is important information: " + monthList);
        }
        return "Why";



    }


}

