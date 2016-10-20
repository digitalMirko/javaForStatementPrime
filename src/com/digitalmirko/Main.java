package com.digitalmirko;

/**
 Challenge
 Create a for statement using any range of numbers
 Determine if the number is a prime number using the isPrime method
 If it is a prime number, print it out AND increase a count of the number of prime numbers found
 if that count is 3 exit the for loop.
 Then try for a count of 12 and exit the for loop
 */

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if(count == 12){  // 3 count, 12 count
                    System.out.println("Exiting the for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
Output for 3 count:
2 is a prime number
3 is a prime number
5 is a prime number
Exiting the for loop
**********************
Output for 12 count:
2 is a prime number
3 is a prime number
5 is a prime number
7 is a prime number
11 is a prime number
13 is a prime number
17 is a prime number
19 is a prime number
23 is a prime number
29 is a prime number
31 is a prime number
37 is a prime number
Exiting the for loop
 */