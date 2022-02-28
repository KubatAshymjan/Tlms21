package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        Days days = null;
        try {
            days = Days.valueOf(day.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            System.out.println("Мындай кун жок");
        }
        switch (days){
            case MONDAY -> System.out.println("Дуйшомбу джава сабагы болот ");
            case TUESDAY -> System.out.println("Шейшемби англис тили болот");
            case WEDNESDAY -> System.out.println("Шаршемби джава сабагы болот");
            case THURSDAY -> System.out.println("Бейшемби soft skill болот ");
            case FRIDAY -> System.out.println("Жума джава сабагы болот");
            case SATURDAY -> System.out.println("Ишемби Субота сабак жок ");
            case SUNDAY -> System.out.println("Жекшемби Воскресенье сабк жок ");


        }
    }
}
