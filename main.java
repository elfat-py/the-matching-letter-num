import java.util.Scanner;

public class SmallTest {
    public static void main (String[] args) {
        char letter;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the single letter character: ");
        letter= Character.toLowerCase(input.next().charAt(0));//We get the input from the user as char data type then use the method 'toLowerCase' so that the input does not matter if it is in capital or not

        //We create an array dedicated for each number with its own specific letters
        char []numTwo= {'a', 'b', 'c'};
        char [] numThree = {'d', 'e', 'f'};
        char [] numFour = {'g', 'h', 'i'};
        char [] numFive = {'j', 'k', 'l'};
        char [] numSix = {'m', 'n', 'o'};
        char []numSeven = {'p', 'q', 'r', 's'};
        char [] numEight = {'t', 'u', 'v'};
        char [] numNine = {'w', 'x', 'y', 'z'};

        //We check if the given input matches with one of our letter indexes in one of the arrays
        //If not we will print Invalid Input as a message
        for (int i =0; i<3; i++)
        {
            if (numTwo[i]==letter)
            {
                System.out.println("It is: Two ");
            }else if (numThree[i]==letter) {
                System.out.println("It is: Three ");
            }else if (numFour[i]==letter) {
                System.out.println("It is: Four ");
            }else if (numFive[i]==letter) {
                System.out.println("It is: Five ");
            }else if (numSix[i]==letter) {
                System.out.println("It is: Six ");
            }else if (numSeven[i]==letter) {
                System.out.println("It is: Seven ");
            }else if (numEight[i]==letter) {
                System.out.println("It is: Eight");
            }else if (numNine[i]==letter) {
                System.out.println("It is: Nine");
            }else
            {
                System.out.println("Invalid Input");
            }
        }
    }
}
