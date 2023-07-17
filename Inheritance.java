// Multiple Inheritance is not supported By Java!


import java.util.Scanner;

class Inheritance {
    public static void main(String[] args) {
        
        Shape s = new Shape("This is for Shape");
        s.set(10,2);
        System.out.println(s.area() + " sqcm.");

        Square sq = new Square();
        sq.set(10,2);
        System.out.println("area = "+sq.area());

    }
}

class Shape {

    protected float length = Float.MIN_VALUE;
    protected float breadth = Float.MIN_VALUE;
    protected static Integer samplevar = 20;

    // public Shape() {

    //     System.out.println("Shape class Constructor is executed!");

    // }


    public Shape(String text){
        System.out.println(text);
    }


    public void set(int length, int breadth) {

        if (length > 0 && breadth > 0) {

            this.length = length;
            this.breadth = breadth;

        } else {
            System.out.println("Dimentions can never be 0 or less!");
        }
    }

    public float area(){
        return length*breadth;
    }
}


class Square extends Shape {


    public Square(){
        super("hello world!");
        System.out.println("Square class Constructor is Executed!");
    }

    // public Square(String text){
    //     System.out.println(text);
    // }

    @Override
    public void set(int length, int breadth){

        if(length == breadth){
            this.length = length;
            this.breadth = breadth;
        } else {
            System.out.println("Sides of square must be same!");
        }

    }
}



class SquareA extends Square {

    @Override
    public void set(int length, int breadth) {

        if(length == breadth && breadth == 20){
            this.length = length;
            this.breadth = breadth;
        } else {
            System.out.println("Not supproted Dimentions!");
        }
    }

    public void extra(){
        System.out.println("Protected Members:- ");
        System.out.println("length = "+length);
        System.out.println("length = "+breadth);
    }

}









