package sampleclass;

public class Rectangle {

    int length;
    int breadth;

    void area(int l,int b){

        length = l;
        breadth = b;
        System.out.println("Area of rectangle is " +(length*breadth));

    }

    public static void main(String args[]){

        Rectangle r1 = new Rectangle();

        r1.area(3,4);
        r1.area(4,5);


    }


}
