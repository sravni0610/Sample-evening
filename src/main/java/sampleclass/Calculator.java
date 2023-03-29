package sampleclass;

public class Calculator {

    void add(int i,int j){
        System.out.println(i+j);
    }

    void add(int i,int j,int k){
        System.out.println(i+j+k);
    }

    void add(double i,double j){
        System.out.println(i+j);
    }

    public static void main(String args[]){
        Calculator c1 = new Calculator();

        c1.add(10,20);
        c1.add(10,20,30);
        c1.add(10.5,11);
    }
}
