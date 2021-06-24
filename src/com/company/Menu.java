package com.company;

import jdk.jshell.SourceCodeAnalysis;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static ArrayList<Person> myPerson = new ArrayList<>();
    public static void main(String[] args) {
        showMenu();
        input();
        List();

    }
    private static void showMenu() {
        int choiceNumber = 0;
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("1.List Person");
            System.out.println("2.Input Person:");
            System.out.println("3.Exit");
            do{
                System.out.println("Please chose 1/2/3:");
                try{
                    choiceNumber = sc.nextInt();

                } catch (Exception e){
                    System.out.println("Please Try Again:");
                    if(sc.hasNextLine()) sc.nextLine();
                    continue;
                }
                switch (choiceNumber){
                    case 1:
                        System.out.println("List:");
                        List();
                        break;
                    case 2:
                        System.out.println("Input");
                        input();
                        break;
                    case 3:
                        System.out.println("Exit");
                        System.exit(0);
                        break;
                }
            } while (choiceNumber < 1 || choiceNumber < 3);
        }

    }
    private static void List() {
        for (Person person: myPerson){
            System.out.println("Name:" +  person.getName() + "Age:" + person.getAge());
        }
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Name:");
        String name = sc.nextLine();
        System.out.println("Input Age:");
        int age = sc.nextInt();
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        myPerson.add(person);
    }




}
