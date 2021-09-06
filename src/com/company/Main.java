package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double ageaverage = 0;
        ArrayList<Person> person = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            person.add(new Person());
            ageaverage += person.get(i).age;

        }

        System.out.println(ageaverage/person.size());
        
        Scanner scanner = new Scanner(System.in);

        Person alder = new Person();

        alder.name = scanner.next();
        alder.age = scanner.nextInt();

        alder.agecheck(alder.age, alder.name);



    }


    }
