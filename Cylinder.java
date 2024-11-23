/*(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * p
volume = area * lengt */
class Cylinder {
    public static void main(String[] args) {
        int radius=7;
        int length=7;
        double volume =radius*radius;
        double area= radius*length;
        System.out.println("The area is "+volume +"and volume is "+area);
    }
}