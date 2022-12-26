import java.util.Scanner;
import java.lang.Math;

//Solve a quadratic equation a*x^2 + b*x + c = 0 for x using user input for a, b, and c
//Identify how many roots it has
public class Quadratic {
    public static void main(String[] args) {
        //Ask for user input for a, b, and c
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c separated by spaces: ");

        //Apply the user input to three different variables
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double dscrm = b * b - 4 * a * c;  //Find the discriminant of the quadratic equation to count # of real roots
        //If the discriminant is negative, there are 0 roots
        if (dscrm < 0){
            System.out.println("There are no roots for the quadratic equation with these coefficients.");

        //If the discriminant equals 0, there is one root, and we solve for it
        } else if (dscrm == 0){
            double r = -b / (2 * a);
            System.out.println("There is one root for the quadratic equation with these coefficients.");
            System.out.println("r1 = " + r);

        //If the discriminant is positive, there are two roots, and we solve for them
        } else if (dscrm > 0){
            double r1 = (-b + Math.sqrt(dscrm)) / (2 * a);
            double r2 = (-b - Math.sqrt(dscrm)) / (2 * a);

            System.out.println("There are two roots for the quadratic equation with these coefficients.");
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
        }
    }
}
