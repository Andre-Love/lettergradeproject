package com.company.lgp;//import a package
import java.util.Scanner;

//Implementation of the class TestAveGrade
public class LetterGrade
{
    //Definition of the calcAverage function
    public static double calcAverage(double userScore1, double userScore2, double userScore3)
    {
        //declare a variable
        double average;
        //calculate the average
        average = (userScore1 + userScore2 + userScore3 ) / 3;
        return average;
    }

    //Definition of the fineGrade function
    public static String fineGrade(double testScore)
    {
        //Declare a variable
        String letterGrade = " ";
        //Check the testScore is 90-100
        if (testScore >= 90 && testScore <= 100)
        {
            letterGrade = "A";
        }
        //Check the testScore is 80-89
        else if (testScore >= 80 && testScore <= 89)
        {
            letterGrade = "B";
        }
        //Check the testScore is 70-79
        else if (testScore >= 70 && testScore <= 79)
        {
            letterGrade = "C";
        }
        //Check the testScore is 60-69
        else if (testScore >= 60 && testScore <= 69)
        {
            letterGrade = "D";
        }
        //Check the testScore is below 60
        else
        {
            letterGrade = "F";
        }
        return letterGrade;
    }

    //main function
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        //declare the variables
        int numberOfScores = 3;
        double userScore;
        double userScore1 = 0;
        double userScore2 = 0;
        double userScore3 = 0;


        String outputString = "The letter grades are as follows:\n";
        //Use a for loop, prompt and read the test grades for students from the user
        for (int currentScore = 1; currentScore <= numberOfScores; currentScore++)
        {
            System.out.print("Enter test grades for student " + currentScore + ":");
            userScore = scanner.nextDouble();
            //Use a switch case to assign letter grades to the students
            switch (currentScore)
            {
                case 1:
                    userScore1 = userScore;
                    outputString += "Test1: " + fineGrade(userScore1) + "\n";
                    break;
                case 2:
                    userScore2 = userScore;
                    outputString += "Test2: " + fineGrade(userScore2) + "\n";
                    break;
                case 3:
                    userScore3 = userScore;
                    outputString += "Test3: " + fineGrade(userScore3) + "\n";
                    break;

                default:
                    break;

            }
        }

        System.out.print(outputString);
        //Display the average grade
        System.out.print("The average grade was:  " + String.format("%.2f", calcAverage(userScore1, userScore2, userScore3 )));

    }
}