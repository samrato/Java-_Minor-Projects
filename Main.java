public class Main {

    public static double printMin(double... numbers) {
        // to know if there is empty list of numberss
        if (numbers.length == 0) return Double.NaN; 
        double min = numbers[0];
        for (double num : numbers) {
            if (num < min) min = num;
        }
        return min;
    }
// ... sysntax for any number to be taken from lists

    public static void main(String[] args) {
        //calling the function to calculate
        System.out.println("Minimum of {4.7, 1.8, 9.8, 4.0}: " + 
        printMin(4.7, 1.8, 9.8, 4.0));
        System.out.println("Minimum of {5.6, 34.3, 9.0, 30.0}: " + 
        printMin(5.6, 34.3, 9.0, 30.0));
        System.out.println("Minimum of {}: " + printMin()); 
    }

    
}
