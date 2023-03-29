package Controlstmts;

public class Excpexam {

    public static void main(String args[]){


        try
        { int i = 100 /0;

        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }

        System.out.println("Rest of the program");
    }


}
