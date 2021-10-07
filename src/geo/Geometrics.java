package geo;
public class Geometrics {
    private static double a = 10.0;
    private static double b = 5.0;
    private static double c = 3.0;

    private static double h = 5.0;
    private static double r = 3.0;
    private static double x = 4.0;


    public static void main(String[] args) {
        squareAreaCalc();
        squarePerimeterCalc();
        rectangleAreaCalc();
        rectanglePerimeterCalc();
        
        System.out.println("We can also calculate some volumes");
        zoneSphere();
        sphereCylinder();
        ungula();        
    }

    public static void squareAreaCalc() {
        System.out.println();
        System.out.println("Square area");
        System.out.println("a * a = " + (a * a)); 
    }

    public static void squarePerimeterCalc() {
        System.out.println();
        System.out.println("Square perimeter");
        System.out.println("4 * a = " + (4 * a));
    }

    public static void rectangleAreaCalc() {
        System.out.println();
        System.out.println("Rectangle area");
        System.out.println("a * b = " + (a * b));
    }

    public static void rectanglePerimeterCalc() {
        System.out.println();
        System.out.println("Rectangle perimeter");
        System.out.println("a + b = " + (a + b));
    }

    public static void zoneSphere() {
        System.out.println();
        System.out.println("Zone of a sphere");
        System.out.println("V = " + ((Math.PI * h * (3 * Math.pow(r, 2) + 3 * Math.pow(x, 2) + Math.pow(h, 2))) / 6));
    }

    public static void sphereCylinder() {
        System.out.println();
        System.out.println("Sphere with cylinder");
        System.out.println("V = " + ((Math.PI * Math.pow(h, 3)) / 6)); 
    }

    public static void ungula() {
        System.out.println();
        System.out.println("Ungula");
        System.out.println("V = " + ((2 * Math.pow(r, 2) * h) / 3));
    }

}
