package geo;
public class Geometrics {
    //Input Variablen
    private static double a = 10.0;
    private static double b = 5.0;
    private static double c = 3.0;
    private static double h = 5.0;
    private static double r = 3.0;
    private static double x = 4.0;

    //Lösungs Variablen
    private static double volumes;
    private static double area;
    private static double perimeter;


    public static void main(String[] args) {
        System.out.println();
        System.out.println("Area calculation");
        squareAreaCalc();        
        rectangleAreaCalc();

        System.out.println();
        System.out.println("Perimeter calculation");
        squarePerimeterCalc();
        rectanglePerimeterCalc();
        
        System.out.println();
        System.out.println("Volumes calculation");
        zoneSphere();
        sphereCylinder();
        ungula();  
        
        System.out.println();
    }

    public static void squareAreaCalc() {
        System.out.println("    Square area:");
        area = a * a; //Berechnung
        System.out.println("        a * a = " + rundeZahl(area)); //Ausgabe inlusive runden
    }

    public static void rectangleAreaCalc() {
        System.out.println("    Rectangle area:");
        area = a * b; //Berechnung
        System.out.println("        a * b = " + rundeZahl(area)); //Ausgabe inlusive runden
    }

    public static void squarePerimeterCalc() {
        System.out.println("    Square perimeter:");
        perimeter = 4 * a; //Berechnung
        System.out.println("        4 * a = " + rundeZahl(perimeter)); //Ausgabe inlusive runden
    }

    public static void rectanglePerimeterCalc() {
        System.out.println("    Rectangle perimeter:");
        perimeter = a + b; //Berechnung
        System.out.println("        a + b = " + rundeZahl(perimeter)); //Ausgabe inlusive runden
    }

    public static void zoneSphere() {
        System.out.println("    Zone of a sphere:");
        volumes = (Math.PI * h * (3 * Math.pow(r, 2) + 3 * Math.pow(x, 2) + Math.pow(h, 2))) / 6; //Berechnung
        System.out.println("        V = " + rundeZahl(volumes)); //Ausgabe inlusive runden
    }

    public static void sphereCylinder() {
        System.out.println("    Sphere with cylinder:");
        volumes = (Math.PI * Math.pow(h, 3)) / 6; //Berechnung
        System.out.println("        V = " + rundeZahl(volumes)); //Ausgabe inlusive runden
    }

    public static void ungula() {
        System.out.println("    Ungula:");
        volumes = (2 * Math.pow(r, 2) * h) / 3; //Berechnung
        System.out.println("        V = " + rundeZahl(volumes)); //Ausgabe inlusive runden
    }

    public static double rundeZahl(double tempValue){ //Runden
        tempValue = Math.round(tempValue*100.0)/100.0;
		return tempValue;
    }
}
