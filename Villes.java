package com.company;

public class Villes {

    public static void afficherTab(int[][] tab){
        for (int j = 0; j < tab.length; j++){
            System.out.println("");
            for (int i = 0; i < tab[j].length; i++){
                System.out.print(tab[j][i] + " ");
            }
        }
    }

    public static int sommeUneLigne(int[][] tab, int iLigne){
        int sommeResult = 0;

        for(int i = 0; i < tab[iLigne].length; i++ ){
            sommeResult += tab[iLigne][i];
        }
        return sommeResult;
    }

    public static double moyenneUneLigne(int[][] tab, int iColonne){
        double moyenneColonne = 0;

        for (int i = 0; i < tab.length; i++){
            moyenneColonne += tab[i][iColonne];
        }

        moyenneColonne /= tab.length;

        return moyenneColonne;
    }

    public static double moyenneUneCol(int[][] tab, int iLigne){
        double moyenneLigne = 0;

        for (int i = 0; i < tab[iLigne].length; i++){
            moyenneLigne += tab[iLigne][i];
        }
        moyenneLigne /= tab[iLigne].length;
        return moyenneLigne;
    }

    public static int maxLigne(int[][] tab, int iLigne){
        int index = 0;

        for (int i = 1; i < tab[iLigne].length; i++){
            if (tab[iLigne][i] > tab[iLigne][index]){
                index = i;
            }
        }

        return tab[iLigne][index];
    }

    public static int minLigne(int [][] tab, int iLigne){
        int index = 0;

        for (int i = 1; i < tab[iLigne].length; i++){
            if (tab[iLigne][i] < tab[iLigne][index]){
                index = i;
            }
        }

        return tab[iLigne][index];
    }
}
