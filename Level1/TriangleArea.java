
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / 6.4516;
        System.out.println("Area in square centimeters is " + areaCm2 + " and in square inches is " + areaIn2);
    }
}
