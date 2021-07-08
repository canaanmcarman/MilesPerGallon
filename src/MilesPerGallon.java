import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        double miles, gallons, mpg;

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter traveled miles: ");
        miles = kb.nextDouble();
        System.out.println("Enter the traveled miles: ");
        gallons = kb.nextDouble();

        mpg = miles / gallons;
        System.out.println("The result is " + mpg + " miles/gallons");

    }
}
