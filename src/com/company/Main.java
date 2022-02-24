package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    String[] alleKort = new String[52];
    String[] typeKort = {"Ruder ", "Klør ", "Hjerte ", "Spar "};
    String[] navnKort = {"Es", "To", "Tre", "Fire", "Fem", "Seks", "Syv", "Otte", "Ni", "Ti", "Knægt", "Dronning", "Konge"};

    //Først deler kortene op i 13 forskellige kort for hver farve/Tegn
    //2 - 10 har numre. Med nr 0 er "ES", dreng, dronning og konge.

    public void opretKort(){
        for (int farve = 0; farve < typeKort.length; farve++) {
            for (int korttal = 0; korttal < navnKort.length; korttal++) {

                int kortStep = korttal + (farve * 13);

                alleKort[kortStep] = typeKort[farve] + navnKort[korttal];
            }
        }
    }
    public void printKort(String[] alleKort2){
        for (int i = 0; alleKort2.length > i; i++) {
            System.out.println(alleKort2[i]);
        }
    }
    public void bytToKort(int første, int anden){

        String gem = "";

        gem = alleKort[første];

        alleKort[første] = alleKort[anden];

        alleKort[anden] = gem;

        System.out.println(alleKort[anden] + " er byttet med " + alleKort[første]);
        System.out.println(Arrays.toString(alleKort));

    }
    public void blandKort(){

        for (int i = 0; 500 > i; i++) {

            Random random = new Random();

            int mrRandom1 = random.nextInt(0,52);
            int mrRandom2 = random.nextInt(0,52);

            String gem = "";

            gem = alleKort[mrRandom1];

            alleKort[mrRandom1] = alleKort[mrRandom2];

            alleKort[mrRandom2] = gem;
        }
        System.out.println(Arrays.toString(alleKort));
    }


    public static void main(String[] args) {
        Main obj = new Main();

        Scanner sc = new Scanner(System.in);

        //Opretter alle kort.
        obj.opretKort();
        System.out.println(Arrays.toString(obj.alleKort));
        //Printer alle kort på en pæn måde.
        obj.printKort(obj.alleKort);
        //Skifter 2 kort ud med hinanden.
        obj.bytToKort(0,1);
        //Blander alle kortene med hinanden.
        obj.blandKort();
    }
}