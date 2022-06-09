package Action_items;

import java.util.ArrayList;

public class Automation_AI01
{
    public static void main(String[] args)
    {
        //creating array list for countries
        ArrayList<String> country = new ArrayList<>();

        //adding them to array
        country.add(" Bangladesh ");
        country.add(" China ");
        country.add(" Finland ");
        country.add(" Ireland ");

        //declaring my ints / country codes
        int[] countryCode = new int[]{880, 86, 358, 353};

        //using for lope for the iteration
        for (int i = 0; i < country.size(); i++)

        {
            //printing them out by country and their codes.
            System.out.println("My Country is" + country.get(i)+ "and my country code is +" + countryCode[i]);
        }

        {
            //using array (linear & arraylist) and loops
            String[] Name = new String[]{"Jack" , "Charley", "Meg"};
            int[] Age = new int[]{22, 30, 27};
            System.out.println("");
            System.out.println("Student name is "+ Name[0]+ " Age " + Age[0]);
        }

        {
            String[] region = new String[]{"Alaska", "Arizona","Florida","Lowa","Maine"};
            int[] areaCode = new int[]{907, 602, 904, 515, 207};
            //initialize your starting point before calling while loop
            int i = 0;

            //define the end point in the while loop
            while (i < region.length)
            {
                //output
                System.out.println("");
                System.out.println("Iteration is on " + i);
                System.out.println("My Region is " + region[i] + " & My Area Code is " + areaCode[i]);

                //incrementing
                i = i + 1;

            }

        }

    }
}
