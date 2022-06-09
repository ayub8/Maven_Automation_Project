package Day_3_043022;

public class Multiple_condition_Statements
{
    public static void main(String[] args)
    {
        //declaring the int for it to hold any value.
        int a = 5;
        int b = 6;
        int c = 7;

        // Checking if a+b is less than c, if it is then it will print out "a + b is less than c". If it is not then it
        // will check if a+b is greater than c, if it is then it will print out "a + b is greater than c". If it is not
        // then it will print out "a + b is equal to c".
        if ( a+b < c )
        {
            System.out.println("a + b is less than c ");
        }
        else if (a+b > c)
        {
            System.out.println("a + b is greater than c ");
        }
        else
        {
            System.out.println(" a + b is equal to c ");
        }


        //declare additional variables
        int d = 4;
        int e = 5;
        int f = 7;

        //or operator with if statement
        //or operator means that it can be either one has to be true
        if (d < e || f < e)
        {
            System.out.println("d is less than e or f is less than e ");
        }
        else
        {
            System.out.println("condition isn't true ");
        }


        // Checking if d is less than e and f is less than e. If it is then it will print out "d is less than e or f is
        // less than e". If it is not then it will print out "condition isn't true".
        //&& it means that both side has to be true or it will say the statement is false.
        if (d < e && f < e)
        {
            System.out.println("d is less than e or f is less than e ");
        }
        else
        {
            System.out.println("condition isn't true ");
        }

    }//end of the main
}//end of class
