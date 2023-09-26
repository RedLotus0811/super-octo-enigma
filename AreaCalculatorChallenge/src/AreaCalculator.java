public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Area of the  circle is  : "+ area(5.0) );
        System.out.println("Invalid call: " + area(-1));
    }

    public static double area() {
        return  -1.0;
    }

    public static double area(double radius) {
        if(radius < 0) return area();
        return Math.PI * radius * radius;


    }

    public static double area(double width, double height) {
        if(width < 0 || height < 0) return area();
        return width * height;
    }
}
