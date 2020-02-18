package com.company;

import java.text.DecimalFormat;
import java.text.Format;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        //a)
            int [][] menu ={{76,68,81,91,65,96,107,94,98,107,96,130}, {55,51,59,65,66,67,69,82,72,61,72,67}, {71,63,70,72,76,90,89,96,89,80,92,92}, {87,68,84,84,78,78,95,91,73,89,86,102}};
            Villes.afficherTab(menu);

        System.out.println(" ");
        System.out.println(" ");

        //b)
            System.out.println( "Québec:" + Villes.sommeUneLigne(menu,0));
            System.out.println( "Toronto:" + Villes.sommeUneLigne(menu,1));
            System.out.println( "Joliette:" + Villes.sommeUneLigne(menu,2));
            System.out.println( "Gaspé:" + Villes.sommeUneLigne(menu,3));

        System.out.println(" ");

        //c)
        System.out.println("Moyenne des précipitations des villes pour Février:" + Villes.moyenneUneLigne(menu,1));

        System.out.println(" ");

        //d)
        System.out.println( "Québec:" + df.format(Villes.moyenneUneCol(menu,0)));
        System.out.println( "Toronto:" + df.format(Villes.moyenneUneCol(menu,1)));
        System.out.println( "Joliette:" + df.format(Villes.moyenneUneCol(menu,2)));
        System.out.println( "Gaspé:" + df.format(Villes.moyenneUneCol(menu,3)));

        System.out.println(" ");

        //e)
        System.out.println("Québec " + Villes.maxLigne(menu,0));
        System.out.println("Toronto " + Villes.maxLigne(menu,1));
        System.out.println("Joliette " + Villes.maxLigne(menu,2));
        System.out.println("Gaspé " + Villes.maxLigne(menu,3));

        System.out.println(" ");

        //f)
        System.out.println("Québec " + Villes.minLigne(menu,0));
        System.out.println("Toronto " + Villes.minLigne(menu,1));
        System.out.println("Joliette " + Villes.minLigne(menu,2));
        System.out.println("Gaspé " + Villes.minLigne(menu,3));
    }
}
