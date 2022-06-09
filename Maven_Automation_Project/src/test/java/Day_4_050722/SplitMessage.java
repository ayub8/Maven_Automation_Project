package Day_4_050722;


public class SplitMessage
{
    public static void main(String[] args)
    {
        //declare string variable
     String splitMessage = "My name is John";
     //declare an array of string to store the string split
        String[] splitMessageArray = splitMessage.split(" ");

        //printout john to the console
        System.out.println("My First name is " + splitMessageArray[3]);
    }
}
