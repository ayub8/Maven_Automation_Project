package Day_2_042322;

import java.util.ArrayList;

public class Forloop
{

    // Creating an ArrayList of cities and then printing out the index and the city name.
    public static void main(String[] args)
    {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Manhattan");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Staten Island");

        for (int i = 0; i < cities.size(); i++)
        {
            System.out.println("I is now " + i);
            System.out.println("My city is " + cities.get(i));// return;
        }

    }
}
