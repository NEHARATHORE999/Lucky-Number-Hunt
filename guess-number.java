package com.JAVAtrial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int mynumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int usernumber=0;
        do{
            usernumber = sc.nextInt();
            if(usernumber < mynumber){
                System.out.println("You are too low");
            }
            else if(usernumber > mynumber){
                System.out.println("You are too high");
            }
            else{
                System.out.println("WOHOOOO!! U DID IT!");
                break;
            }
        }
        while(usernumber>=0);


    }
}