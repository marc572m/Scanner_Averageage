package com.company;

import java.util.Random;

public class Person {

    Random random = new Random();
    String name;
    int age = random.nextInt(100)+1;

    public void agecheck(int age, String name){
        if(age < 21){
            System.out.println("You're not old enough");
        } else{
            System.out.println("You're 21 or over!");
        }



    }

}


