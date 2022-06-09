package Day_2_042322;

import java.util.Arrays;

public class WhileLoop {
    public static void main(String[] args) {
        //iterate through zipcode and its streets number using linear array and while loop
        String[] zipCodes = new String[]{"11218", "11219","11220","11221","11222"};
                int[] houseNumber = new int[]{111,222,333,444,555};
        //initialize your starting point before calling while loop
        int i = 0;

        //define the end point in the while loop
        while (i < houseNumber.length)
        {
            //output
            System.out.println("i = " + i);
            System.out.println("My ZipCode is " + zipCodes[i] + " house number " + houseNumber[i]);

            //incrementing
            i = i + 1;

        }
    }

}
