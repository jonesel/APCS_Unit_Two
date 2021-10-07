import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        // Create a scanner object to be able to get input from the user
        Scanner scan = new Scanner(System.in);

        public double getX();
    {
            System.out.println("Please enter the x-coordinate of your rectangle: ");
            scan.nextInt();
    }



        public double getY();
    {
        System.out.println("Please enter the y-coordinate of your rectangle: ");
        scan.nextInt();
    }

        public double getWidth();
    {
            System.out.println("Please enter the width of your rectangle: ");
            scan.nextInt();

    }

        public double getHeight();
    {
        System.out.println("Please enter the height of your rectangle: ");
        scan.nextDouble();

        return 3.5;
    }



        public void setLocation(int x, int y);
        {

        }


        public Rectangle(int x,int y,int width,int height);
        {
            System.out.println("X: "+getX);
            System.out.println("Y: "+getY);
            System.out.println("Width: "+getWidth);
            System.out.println("Height: "+getHeight);
        }
public void perimeter();
    {
        System.out.println("Perimeter: "+2*(getHeight+getWidth));
    }
        // Get input for x, y, width, and height. Create four separate variables for these.


        // Create a Rectangle object using the four pieces of user input.


        // Use the appropriate methods (getWidth() and getHeight() ) to calculate the perimeter, then print it

        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.

    }

}
