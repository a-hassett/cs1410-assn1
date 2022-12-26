import java.util.Scanner;
import java.lang.Math;

//Take the first 9 digits of an ISBN-10 and find the checksum digit of the number to verify the rest
public class ISBN {
    public static void main(String[] args) {
        //Get user input for the first 9 digits
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");

        int isbn = input.nextInt();  //Apply the user input to a variable
        int tens = (int)Math.pow(10, 8);  //Make a variable to represent 100,000,000 that will be different powers of 10

        //Get the first digit and then get rid of it from the ISBN
        int d1 = isbn / tens;
        isbn = isbn - (d1 * tens);
        tens = tens / 10;

        //Get the second digit and then get rid of it from the ISBN
        int d2 = isbn / tens;
        isbn = isbn - (d2 * tens);
        tens = tens / 10;

        //Get the third digit and then get rid of it from the ISBN
        int d3 = isbn / tens;
        isbn = isbn - (d3 * tens);
        tens = tens / 10;

        //Get the fourth digit and then get rid of it from the ISBN
        int d4 = isbn / tens;
        isbn = isbn - (d4 * tens);
        tens = tens / 10;

        //Get the fifth digit and then get rid of it from the ISBN
        int d5 = isbn / tens;
        isbn = isbn - (d5 * tens);
        tens = tens / 10;

        //Get the sixth digit and then get rid of it from the ISBN
        int d6 = isbn / tens;
        isbn = isbn - (d6 * tens);
        tens = tens / 10;

        //Get the seventh digit and then get rid of it from the ISBN
        int d7 = isbn / tens;
        isbn = isbn - (d7 * tens);
        tens = tens / 10;

        //Get the eighth digit and then get rid of it from the ISBN
        int d8 = isbn / tens;
        isbn = isbn - (d8 * tens);
        tens = tens / 10;

        //Get the ninth digit
        int d9 = isbn / tens;

        //Find the checksum then print it onto the end of the 9-digit ISBN
        int checksum = (d1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;
        if (checksum == 10){
            System.out.println("The ISBN-10 number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        } else{
            System.out.println("The ISBN-10 number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + checksum);
        }
    }
}

