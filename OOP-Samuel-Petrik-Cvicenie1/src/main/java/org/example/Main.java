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
        case 1:
        {
            if (day <= 20) {
                vysledok = "Kozorozec";
            } else if (day > 20 && day <= 31) vysledok = "vodnar";
            else vysledok = "chyba";
            break;
        }

        case 2:
        {
            if (day <= 19) {
                vysledok = "Vodnar";
            } else if (day > 19 && day <= 29) vysledok = "Ryby";
            else vysledok = "chyba";
            break;
        }

        case 3:
        {
            if (day <= 20) {
                vysledok = "Ryby";
            } else if (day > 20 && day <= 31) vysledok = "Baran";
            else vysledok = "chyba";
            break;
        }

        case 4:
        {
            if (day <= 20) {
                vysledok = "Baran";
            } else if (day > 20 && day <= 30) vysledok = "Byk";
            else vysledok = "chyba";
            break;
        }

        case 5:
        {
            if (day <= 20) {
                vysledok = "Byk";
            } else if (day > 20 && day <= 31) vysledok = "Blizenci";
            else vysledok = "chyba";
            break;
        }

        case 6:
        {
            if (day <= 21) {
                vysledok = "Blizenci";
            } else if (day > 21 && day <= 30) vysledok = "Rak";
            else vysledok = "chyba";
            break;
        }

        case 7:
        {
            if (day <= 22) {
                vysledok = "Rak";
            } else if (day > 22 && day <= 31) vysledok = "Lev";
            else vysledok = "chyba";
            break;
        }

        case 8:
        {
            if (day <= 22) {
                vysledok = "Lev";
            } else if (day > 22 && day <= 31) vysledok = "Panna";
            else vysledok = "chyba";
            break;
        }

        case 9:
        {
            if (day <= 22) {
                vysledok = "Panna";
            } else if (day > 22 && day <= 30) vysledok = "Váhy";
            else vysledok = "chyba";
            break;
        }

        case 10:
        {
            if (day <= 22) {
                vysledok = "Vahy";
            } else if (day > 22 && day <= 31) vysledok = "Skorpion";
            else vysledok = "chyba";
            break;
        }

        case 11:
        {
            if (day <= 22) {
                vysledok = "Skorpion";
            } else if (day > 22 && day <= 30) vysledok = "Strelec";
            else vysledok = "chyba";
            break;
        }

        case 12:
        {
            if (day <= 21) {
                vysledok = "Strelec";
            } else if (day > 21 && day <= 31) vysledok = "Kozorozec";
            else vysledok = "chyba";
            break;
        }

        defaul:
        {
            vysledok = "chyba";
            break;
        }


    }


    }
}

