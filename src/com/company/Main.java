package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String name = "Дастан,";
        int age = 30;
        int temp = 0;

        if (age >= 20 && age <= 45 && temp <= 30 && temp >= -20) {
            System.out.println(name + " можете идти гулять");
        } else if (age <= 20 && temp >= 0 && temp <= 28) {
            System.out.println(name + " можете погулять");
        } else if (age >= 45 && temp >= -10 && temp <= 25) {
            System.out.println(name + " можно гулять");
        } else {
            System.out.println(name + " не выходите на улицу");
        }
    }

}



