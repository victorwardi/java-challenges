package com.company;

public class MethodReferencVSLambdaChallenge {

    public static void main(String[] args) {

        Runnable runWithLambda = () -> new Player().showScore(); // constructor is executed every call
        Runnable runWithMethodReference = new Player()::showScore; // constructor is called only once

        System.out.println("runWithLambda");
        runWithLambda.run(); // 1
        runWithLambda.run(); // 2
        runWithLambda.run(); // 3
        runWithLambda.run(); // 4
        runWithLambda.run(); // 5

        System.out.println("\nrunWithMethodReference");

        runWithMethodReference.run(); // 0
        runWithMethodReference.run(); // 0
        runWithMethodReference.run(); // 0
        runWithMethodReference.run(); // 0
        runWithMethodReference.run(); // 0

    }

    static class Player {

        private static int goals;
        private int score;

        Player(){
           this.score = goals++;
        }

        void showScore(){
            System.out.print(this.score);
        }

    }
}
