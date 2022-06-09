package Action_items;

import java.util.ArrayList;

public class Automation_AI02_Part2
{
    public static void main(String[] args)
    {
        // Creating an array list of cities.
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        cities.add("Staten");

        // Iterating through the array list and printing out the cities that are Brooklyn or Manhattan.
        //using the for loop to get thru the two city that is asked for.
        for (int i = 0; i < cities.size(); i++)

        {
            // this if sentence will only pick those cities that are listed under Arraylist.
            //if not it won't print the city that you are looking for.
            // || this is an OR operator that
            if (cities.get(i) == "Brooklyn" || cities.get(i) == "Manhattan" )
            {
                System.out.println("Your city is " + cities.get(i) + ".");
            }
        }
    }
}
