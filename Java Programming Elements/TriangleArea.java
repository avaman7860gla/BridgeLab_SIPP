import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();

        double height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n",
                         areaInches, areaCm);
    
    }
}