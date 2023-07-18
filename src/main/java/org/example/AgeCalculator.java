package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("tugilgan kunizni kiriting (YYYY-MM-DD): ");
        String birthdateString = scanner.nextLine();

        LocalDate birthdate = LocalDate.parse(birthdateString);

        Period period = birthdate.until(LocalDate.now());

        System.out.println("siz yashagansiz:");
        System.out.println(period.getYears() + " yil");
        System.out.println(period.getMonths() + " oy");
        System.out.println(period.getDays() + " kun");
        System.out.println("siz umimiy shuncha yashagansiz=>" + (period.getYears() * 365) + (period.getMonths() * 30) + period.getDays());

    }

}

class ppu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tugilgan kunizni kiriting(YYYY-MM-DD)");
        String birthdat = scanner.nextLine();

        LocalDate localDate=LocalDate.parse(birthdat);

        Period period=localDate.until(LocalDate.now());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());


    }


}

