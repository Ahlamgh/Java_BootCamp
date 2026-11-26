import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
            two numbers , takes two numbers as input
            */
        System.out.print("enter a number1: ");
        int num1 = input.nextInt();
        System.out.print("enter a number2: ");
        int num2 = input.nextInt();
        System.out.print("num1 + num2 = ");
        System.out.println(num1 + num2);
        System.out.print("num1 - num2 = ");
        System.out.println(num1 - num2);
        System.out.print("num1 * num2 = ");
        System.out.println(num1 * num2);
        System.out.print("num1 / num2 = ");
        System.out.println(num1 / num2);
        System.out.print("num1 % num2 = ");
        System.out.println(num1 % num2);

        //**************************************************************************

        /* Write a Java program that takes a number as input and prints its multiplication table up to 10. */
        System.out.print("enter your number : ");
        int num3= input.nextInt();
        for(int i =1; i<= 10; i++){
            System.out.println(i+" * "+num3+" = "+(i*num3));
        }

        //**********************************************************************

        /*
        3. Write a Java program to print the area and perimeter of a circle.
        */
        System.out.print("enter a radius of circle : ");
        double radius = input.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        //********************************************************************

        /* 4. Java program to find out the average of a set of integers */
        System.out.print("Enter the count of numbers: ");
        int count = input.nextInt();
        int sum =0;
        for(int i =0; i< count; i++){
            System.out.print("Enter an integer:");
            int numIn = input.nextInt();
            sum += numIn;
        }
        double average1 = (double) sum / count;
        System.out.print("The average is:"+ average1);

        //***********************************************************

        /* 5. Write a Java program that accepts three integers as input, adds the first two integers
        together, and then determines whether the sum is equal to the third integer. */

        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        System.out.print("Enter the third number: ");
        int third = input.nextInt();

        if((first+second) == third){
            System.out.print("The result is: true ");
        }else{
            System.out.print("The result is: false ");
        }

        //*************************************************************

        /* 6. Write a Java program to reverse a word. */
        System.out.print("please enter a word: ");
        String word = input.nextLine();
        StringBuilder sb = new StringBuilder(word);
        System.out.println("Reverse word: " +sb.reverse());

        //***************************************************************

        /* 7 - Java program to check whether the given number is even or odd */
        System.out.print("Enter a number: ");
        int num4 = input.nextInt();
        if(num4 % 2 ==0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd ");

        //************************************************************
        /*8 - Java program to convert the temperature in Centigrade to Fahrenheit  */
        System.out.print("Enter temperature in Celsius is: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.print("Enter temperature in Fahrenheit is: "+ fahrenheit);

        //*****************************************************************

        /* 9.Write a Java program that takes a string and a number from the user,then prints the
            character in the given index. */
        System.out.print("Enter a string: ");
        String sent = input.nextLine();
        System.out.print("Enter a number from 0 to "+(sent.length()-1) +" : ");
        int inde = input.nextInt();
        System.out.print("The character is: "+ sent .charAt(inde));

        //***************************************************************
        /* 10. Write a Java program to print the area and perimeter of a rectangle. */

        System.out.print("enter a Width of rectangle : ");
        double width= input.nextDouble();
        System.out.print("enter a Height of rectangle : ");
        double height= input.nextDouble();
        double perimeterRec = 2 * (width + height);
        double areaRec = width * height;
        System.out.println("Perimeter is = " + perimeterRec);
        System.out.println("Area is = " + areaRec);

        //***************************************************************
        /* 11. Write a Java program to compare two numbers*/
        System.out.print("Input first integer:");
        int firstNum = input.nextInt();
        System.out.print("Input second integer:");
        int secondNum = input.nextInt();

        if(firstNum == secondNum)
            System.out.println(firstNum+ " == "+secondNum);
        else
            System.out.println(firstNum+ " != "+secondNum);

        if(firstNum > secondNum)
            System.out.println(firstNum+ " > "+secondNum);
        else
            System.out.println(firstNum+ " <= "+secondNum);

        if(firstNum < secondNum)
            System.out.println(firstNum+ " < "+secondNum);
        else
            System.out.println(firstNum+ " >= "+secondNum);

        //***************************************************************
        /* 12. Write a Java program to convert seconds to hours, minutes and seconds. */

        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        // convert sec to hrs then account the remaining
        int hrs = seconds / 3600;
        int restSec= seconds % 3600;
        // sec/60 == min and the remaining is sec
        int mins= restSec/ 60;
        int sec= restSec % 60;
        System.out.print(hrs+" : "+mins+" : "+sec);

        //***************************************************************
        /* 13. Write a Java program that accepts four integers from the user and prints equal if all
            four are equal, and not equal otherwise.*/

        System.out.print("Input first number:");
        int number1= input.nextInt();
        System.out.print("Input second number:");
        int number2= input.nextInt();
        System.out.print("Input third number:");
        int number3 = input.nextInt();
        System.out.print("Input  fourth number:");
        int number4 = input.nextInt();

        if(number1 == number2 && number1==number3 && number1== number4)
            System.out.print("Numbers are equal! ");
        else
            System.out.print("Numbers are not equal! ");

        //***************************************************************
        /* 14. Write a Java program that reads an integer and check whether it is negative, zero, or
            positive.*/
        System.out.print("Input a number:");
        int numberCheck= input.nextInt();
        if(numberCheck == 0)
            System.out.println("number is Zero");
        else if(numberCheck > 0)
            System.out.println("number is positive");
        else
            System.out.println("number is negative");

        //***************************************************************
        /* 15.Write a program to enter the numbers till the user wants and at the end it
         should display the count of positive, negative and zeros entered (End loop use -1 ,(End loop use -1 ,
        Don’t count -1). */
        System.out.print("Input a number to continue or -1 to exit:");
        int numCheck=  input.nextInt();
        int zer =0;
        int pos=0;
        int neg = 0;
        while(numCheck != -1){
            if(numCheck == 0)
                zer +=1;
            else if(numCheck > 0)
                pos +=1;
            else
                neg +=1;
            System.out.print("Input a number to continue or -1 to exit:");
            numCheck=  input.nextInt();
        }
        System.out.println("count of zero: "+zer);
        System.out.println("count of positive: "+pos);
        System.out.println("count of negative: "+neg);

        //***************************************************************
        /* 16 - Write a program that prompts the user to input an integer and then outputs the
            number with the digits reversed. */

        System.out.print("Enter an integer : ");
        int numToRes = input.nextInt();
        String numToStr = String.valueOf(numToRes);
        String reversed="";
        for(int i = numToStr.length()-1; i>=0 ; i--){
            reversed +=  numToStr.charAt(i);
        }
        System.out.print("Reversed number: " + reversed);

    //******************************************************************************
        /* 17 - Write a program to enter the numbers till the user wants and at the end the
        program should display the largest and smallest numbers entered. */

        System.out.print("Enter a number:");
        int num5 = input.nextInt();
        int largest = num5;
        int smallest = num5;

        System.out.print("do you want to continue? (yes/no): ");
        String stop = input.next();

        while (stop.equalsIgnoreCase("yes")) {
            System.out.print("Enter a number: ");
            num5 = input.nextInt();

            if (num5 > largest)
               largest = num5;
            else if (num5 < smallest)
               smallest = num5;

            System.out.print("do you want to continue? (yes/no): ");
            stop = input.next();
            }
        System.out.println("The largest number"+ largest);
        System.out.println("The smallest number"+ smallest);

    //*********************************************************************************
    /* 18 - Determine and print the number of times the character ‘a’ appears in the input
            entered by the user. */
        System.out.print("Enter String : ");
        String str = input.nextLine();
        int countChar=0;
        String cleanStr = str.replaceAll("(?U)\\s+", "");

        for(int i=0 ; i < cleanStr.length(); i++){
          if(cleanStr.replaceAll("\\s+", "").toLowerCase().charAt(i)=='a')
                countChar += 1;
      }

        System.out.println("The number of times the character ‘a’ appears = "+ countChar);
    }
}