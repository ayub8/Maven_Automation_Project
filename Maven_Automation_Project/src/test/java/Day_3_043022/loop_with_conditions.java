package Day_3_043022;

import java.util.ArrayList;

public class loop_with_conditions {
    public static void main(String[] args)
    {
        //creating an array list with fruits and print only when fruits is apple or orange.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Strawberry");
        fruits.add("Apple");


        // Printing out the fruits that are in the list.
        for (int i = 0; i < fruits.size(); i++)
        {
            if (fruits.get(i) == "Apple")
            {
                System.out.println("My fruit is " + fruits.get(i));
            }
            else if (fruits.get(i) == "Grape")
            {
                System.out.println("My fruit is " + fruits.get(i));
            }

       /*     // this if function is with OR operator
           if (fruits.get(i) == "Apple" || fruits.get(i) == "Grape")
           {
               System.out.println("My fruit is " + fruits.get(i));

            }
*/
        }
    }
}
