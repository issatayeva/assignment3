import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Assignment1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("./src/file1.txt"));
        Scanner sc2 = new Scanner(new File("./src/file2.txt"));
        int x, y;
        Shape shape1 = new Shape();
        while(sc1.hasNextLine()) {
            x = sc1.nextInt();
            y = sc1.nextInt();
            Point p1 = new Point(x, y);
            shape1.addPoint(p1);
        }
        System.out.println("The perimeter of first shape is: " + shape1.calculatePerimeter()); // output
        System.out.println("The longest side of first shape is: " + shape1.longestSide());
        System.out.println("The average length is: " + shape1.average());
        Shape shape2 = new Shape();
        while(sc2.hasNextLine()) {
            x = sc2.nextInt();
            y = sc2.nextInt();
            Point p2 = new Point(x, y);
            shape2.addPoint(p2);
        }
        System.out.println("The perimeter of second shape is: " + shape2.calculatePerimeter()); // output
        System.out.println("The longest side of second shape is: " + shape2.longestSide());
        System.out.println("The average length is: " + shape2.average());

    }

}
