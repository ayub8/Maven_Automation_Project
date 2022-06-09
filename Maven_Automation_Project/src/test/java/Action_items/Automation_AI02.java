package Action_items;

import java.util.ArrayList;

public class Automation_AI02
{
    public static void main(String[] args)
    {
        //inputting grade
        int grade = 10;

        //conditioning what the grade is falling under.
        // Checking the grade and printing out the grade.
        if (grade >= 90 && grade <= 100)
        {
            System.out.println("Your Grade is A " );
        }
        else if (grade >= 80 && grade < 90)
        {
            System.out.println("Your Grade is B ");
        }
        else if (grade >= 70 && grade < 80)
        {
            System.out.println("Your Grade is C " );
        }
        else if (grade >= 60 && grade < 70)
        {
            System.out.println("Your Grade is D " );
        }
        else
        {
            System.out.println("Your Grade is F");
        }
    }

}
