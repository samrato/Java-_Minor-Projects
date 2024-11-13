package Loops;

public class Rectangle {
    class recta{
     
        private double lenghth;
        private double witdh ;
  
    // setters 
    public void setWidh(int x ){
        lenghth=x;
    }
    public void setLenght(int y){
        witdh=y;
    }
    //getters
    double getWidh(){return lenghth;}
    double getLength(){return witdh;}
    // Calculations 
    double peri =2*(getLength()+getWidh());
    double Area = getLength()*getWidh();

    //Displays
    void Displays (){
        System.err.println(getLength());
        System.out.println(getWidh());
        System.out.println(peri);
        System.out.println(Area);
    }
    }
    
    public static void main(String[] args) {
        recta obj=new recta();
        //obj.Displays();
        obj.setLenght(7);
        obj.setWidh(8);
        obj.Displays();
    }
}
