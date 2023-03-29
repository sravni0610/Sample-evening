package Controlstmts;

public class Simple {

    public static void main(String args[]){

        int a = 10;
        int b = 10;

        if(a+b > 25){
            System.out.println("a + b is greater than 25");
        }
        else {
            System.out.println("a + b is not greater than 25");
        }


        String city = "Londondsfs";

        if(city == "Manchester"){
            System.out.println("City value is Manchester");
        }
        else if (city == "New Castle") {
            System.out.println("City value is New Castle");

        } else if (city == "Bath") {
            System.out.println("City value is Bath");

        } else if (city == "Swindon") {

            System.out.println("City value is Swindon");
        } else if (city == "London") {
            System.out.println("City value is London");

        }
        else {
            System.out.println("City value is Bristol");
        }


        int age = 25;
        int weight = 40;
        if(age >= 18){
            if(weight>50){
                System.out.println("Person is eligible to donate blood");
            }
            else {
                System.out.println("Person is not eligible due to weight");
            }
        }

        else {
            System.out.println("Person is not eligible due to age");
        }


    }
}
