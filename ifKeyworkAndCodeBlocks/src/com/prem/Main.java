package com.prem;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Score is less than 5000 but greater than 1000");
        } else {
            System.out.println("This code is not 5000");
        }

        if (gameOver == true){
            int finalScore = score + ( levelCompleted * bonus );
            System.out.println("The final score is = " + finalScore);
        }
    }
}
