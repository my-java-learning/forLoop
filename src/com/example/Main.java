package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0 , 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0 , 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0 , 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0 , 5.0));

        for(int i = 0; i < 5 ; i++){
            System.out.println("Loop " + i + " hello!");
        }

        for(int interestRate = 8; interestRate >= 2; interestRate--){
            System.out.println("10,000 at " + interestRate + "% interest = " + String.format("%.2f",calculateInterest(10000.0, interestRate)));
        }

        System.out.println("" + isPrime(3));
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int number){
        if(number > 1){
            int counter = 0;
            for(int i = 2 ; i <= number ; i++){
               if(number % i == 0) counter++;
            }
            if (counter == 2) return true;
        }
        return false;
    }
}
