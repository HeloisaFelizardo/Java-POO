/* 1. Printing stars: 
 * Define a method called printStars that prints the given number of stars and a line break.
 
Sample output

*****
***
*********

 * 2. Printing a square: 
 * Define a method called printSquare(int size) that prints a suitable square with the help
 *  of the printStars method. So the method call printSquare(4) results in the following output:
  
Sample output

****
****
****
****

 * 3. Printing a rectangle: 
 * Write a method called printRectangle(int width, int height) that prints the correct 
 * rectangle by using the printStars method. So the method call printRectangle(17, 3) 
 * should produce the following output:

Sample output

*****************
*****************
*****************

 * 4. Printing a triangle: 
 * Create a method called printTriangle(int size) that prints a triangle by using the 
 * printStars method. So the call printTriangle(4) should print the following:

Sample output

*
**
***
****
*/
public class StarSign {

    public static void main(String[] args) {

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i <= size; i++) {
            printStars(i);
        }
    }
}
