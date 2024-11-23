package Loops;

public class Rectangle {
    class Recta {

        private double length;
        private double width;

        // Setters
        public void setWidth(double x) {
            width = x;
        }

        public void setLength(double y) {
            length = y;
        }

        // Getters
        double getWidth() {
            return width;
        }

        double getLength() {
            return length;
        }

        // Calculations
        double calculatePerimeter() {
            return 2 * (getLength() + getWidth());
        }

        double calculateArea() {
            return getLength() * getWidth();
        }

        // Displays
        void display() {
            System.out.println("Length: " + getLength());
            System.out.println("Width: " + getWidth());
            System.out.println("Perimeter: " + calculatePerimeter());
            System.out.println("Area: " + calculateArea());
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        Rectangle outer = new Rectangle();

        // Create an instance of the inner class
        Recta obj = outer.new Recta();

        // Set values
        obj.setLength(7);
        obj.setWidth(8);

        // Display results
        obj.display();
    }
}
