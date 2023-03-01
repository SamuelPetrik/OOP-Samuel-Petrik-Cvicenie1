package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ENG: Hello world! <---> SVK: Ahoj svet!");
    }


Scanner NacitanieKlavesnica = new Scanner(System.in);


    while(char == 'Y'){

        System.out.println("Zadajte den narodenia:");
        int den = NacitanieKlavesnica.nextInt();

        System.out.println("Zadajte mesiac narodnia");
        int mesiac = NacitanieKlavesnica.nextInt();

        String vysledok = Znamenie(mesiac, den);
        System.out.println("Vase znamenie zverokruhu je:" + vysledok);

        System.out.println("Chcete pokracovat (Y/N)");
        char odpoved = NacitanieKlavesnica.next().charAt(0);
    }

    Znamenie(int day, int month, String vysledok){
    switch (month)
    {
        case 1 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 2 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 3 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 4 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 5 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 6 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 7 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 8 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 9 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 10 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 11 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 1 {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }
        case (default)
            break;
    }


    }


    }
}

