import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* 1.Write a program that prints the numbers from 1 to 100 such that:
        If the number is a multiple of 3, you need to print "Fizz" instead of that
        number. If the number is a multiple of 5, you need to print "Buzz" instead of that
        number.
        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
          instead of that number. */

        for(int i =1; i<=100; i++){
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 5 == 0 && i % 3 != 0)
                System.out.println("Buzz");
            else if (i % 3 == 0  && i % 5 != 0)
                System.out.println("Fizz");
            else
                System.out.println("the current number is "+i);
        }

        //*********************************************************

        /*2.Write a Java program to reverse a string.
            Test Data: Input a string: The quick brown fox Expected Output: Reverse
            string: xof nworb kciuq ehT */
        System.out.println("please enter a sentence: ");
        String sentence = input.nextLine();
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println("Expected Output: " +sb.reverse());

        //******************************************************************

        /*
        3.Write a program to find the factorial value of any number entered
            through the keyboard.
        */

        System.out.print("enter a number: ");
        int number = input.nextInt();
        int factorial = 1;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("factorial = " + factorial);
        } else {
            System.out.println("invalid number");
        }

        //*********************************************************************

        /* 4.Two numbers are entered through the keyboard. Write a program to find
            the value of one number raised to the power of another. (Do not use Java
            built-in method) */

        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        double result = 1;
        if (power == 0) { //
            result = 1;
        } else if (power > 0) {
            //Positive
            for (int i = 1; i <= power; i++) {
                result *= base;
            }
        } else {
            //negative
            for (int i = 0; i > power; i--) {
                result /= base;
            }
        }
        System.out.println(base + " raised to the power of "+ power + " = " + result);

        //****************************************************************

        /* 5.Write a program that reads a set of integers, and then prints the sum of
            the even and odd integers. */

        int oddSum = 0;
        int evenSum = 0;
        System.out.print("How many numbers do you want to enter? ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("enter number " + i + ": ");
            int num = input.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);

        //*****************************************************************

        /* 6.Write a program that prompts the user to input a positive integer. It
            should then output a message indicating whether the number is a prime
            number.*/

        System.out.print("enter a positive integer: ");
        int positiveNum = input.nextInt();
        boolean isPrime = true;

        if (positiveNum <= 0) {
            System.out.println("is not positive integer");
        } else {

            if (positiveNum == 1) {
                isPrime = false;
            }else{
                for (int i = 2; i < positiveNum; i++) {
                    if (positiveNum % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(positiveNum + " is a prime number.");
            } else {
                System.out.println(positiveNum + " is not a prime number.");
            }
        }

        //************************************************************************

        /* 7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
            another for loop to print the days (Days 1 -7) for each week.
        */

       for (int i = 1; i <= 4; i++) {
            System.out.println("Week " + i);
            for (int d = 1; d <= 7; d++) {
                System.out.println("Day" + d);
            }
        }

        //*******************************************************************************

        /* 8.Write a program thats check if the word is a palindrome or not. hint: A
            string is said to be a palindrome if it is the same if we start reading it from
            left to right or right to left. */

        System.out.print("enter word: ");
        String word = input.next();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        } 

    }
}