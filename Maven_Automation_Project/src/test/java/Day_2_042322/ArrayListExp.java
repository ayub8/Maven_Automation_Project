package Day_2_042322;
import java.util.ArrayList;

public class ArrayListExp
{
    public static void main(String[] args)
    {
        //Create an ArrayList for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA"); //this is index 0
        countries.add("Bangladesh"); //this is index 1
        countries.add("India"); //this is index 2
        countries.add("Canada"); //this is index 3
        countries.add("Pakistan"); //this is index 4
        System.out.println(" My Last country is " + countries.get(4)+ " and my third country is " + countries.get(2));

    }//end of main method
}// end of java class

