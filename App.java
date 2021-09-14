package org.example;

import java.util.Scanner;
import java.lang.Math;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Objective: create a program that easily divides 2 number and display the remainder
        Scanner scan = new Scanner(System.in);
        int people, pizzas, slices, divide, remainder;
        System.out.print("How many people? ");
        people = scan.nextInt();
        System.out.print("How many pizzas do you have? ");
        pizzas = scan.nextInt();
        slices = pizzas * 8; //assuming each pizza has 8 slices
        System.out.println(people +" people with " +pizzas +" pizzas(" +slices +" slices)");
        divide = slices/people;
        remainder = slices%people;
        System.out.println("Each person gets " +divide +" pieces of pizza.\nThere are " +remainder +" leftover pieces." );

    }
}

