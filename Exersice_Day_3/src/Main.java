import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* 1.Write a program that checks the role of the user
            If the role is admin print "welcome admin"
            If the role is superuser print "welcome superuser"
            If the role is user print "welcome user" (tip:
            use if else)*/

        System.out.println("enter your role ");
        String role = input.nextLine();
        if(role.trim().equalsIgnoreCase("admin"))
            System.out.println("welcome admin");
        else if(role.trim().equalsIgnoreCase("superuser"))
            System.out.println("welcome superuser");
        else if(role.trim().equalsIgnoreCase("user"))
            System.out.println("welcome user");
        else
            System.out.println("you enter the wrong role");

        //***********************************************************************
        /*
            2.Take three numbers from the user and print the greatest number.
        */

        System.out.println("enter num1");
        int num1 = input.nextInt();
        System.out.println("enter num2");
        int num2 = input.nextInt();
        System.out.println("enter num3");
        int num3 = input.nextInt();
        if((num1>num2) && (num1>num3))
            System.out.println("the greatest number"+ num1);
        else if((num2>num3) && (num2>num1))
            System.out.println("the greatest number" + num2);
        else
            System.out.println("the greatest number" + num3);

        //********************************************************************

        /* 3.Write a Java program that generates an integer between 1 and 7
            and displays the name of the weekday.
        */

        int day = (int)(Math.random() * 7) + 1;
        System.out.println("generate random number: " + day);
        // if you want it as input from user:
        // System.out.println("Enter the number of day: " );
        // int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

        //********************************************************************
        /*
           4. Write a program that takes a numeric score as input and prints
            the corresponding letter grade using the following grading scale
        */
        System.out.println("numeric score");
        double score = input.nextDouble();

        if(score <= 100 && score >= 90) {
            System.out.println("Numeric Score : " +score);
            System.out.println("Letter Grade: A");
        }else if(score < 90 && score >= 80) {
            System.out.println("Numeric Score : " +score);
            System.out.println("Letter Grade: B");
        }else if(score < 80 && score >= 70) {
            System.out.println("Numeric Score : " +score);
            System.out.println("Letter Grade: C");
        }else if(score < 70 && score >= 60) {
            System.out.println("Numeric Score : " +score);
            System.out.println("Letter Grade: D");
        }else if (score < 60 && score >= 0){
            System.out.println("Numeric Score : " +score);
            System.out.println("Letter Grade: F");
        }


        //**********************************************************************************

        /*5. Write a Java program that takes a person's age as input and categorizes them into one of
        three age categories: "Child", "Teenager," or "Adult" using an if statement.*/
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age < 13) {
            System.out.println("You are child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are teenager");
        } else {
            System.out.println("You are adult");
        }
    }
}