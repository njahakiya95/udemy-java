package com.company;

public class Main {

    public static void main(String[] args) {
        int topScore = 80;
        int secondTopScore = 81;
        
        if (topScore < 100) {
            System.out.println("You go the high score");
        }

        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
    }
}
