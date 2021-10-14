import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the x-coordinate of your rectangle: ");
        int x = scan.nextInt();
        System.out.println("Please enter the y-coordinate of your rectangle: ");
        int y = scan.nextInt();
        System.out.println("Please enter the width of your rectangle: ");
        int width = scan.nextInt();
        System.out.println("Please enter the height of your rectangle: ");
        int height = scan.nextInt();
        Rectangle r = new Rectangle( x, y, width, height);



        System.out.println("Perimeter= "+2*(r.getHeight()+r.getWidth()));
        System.out.print("New location is "+r.setLocation(r.getX()-4,r.getY()+2));

        // Get input for x, y, width, and height. Create four separate variables for these.


        // Create a Rectangle object using the four pieces of user input.


        // Use the appropriate methods (getWidth() and getHeight() ) to calculate the perimeter, then print it

        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.

    }

}
