package Controlstmts;

public class Sample1 {

    public static  void main(String args[]){

        int number = 50;

        switch (number){

            case 10:
                System.out.println("10");
                break;

            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            case 40:
                System.out.println("40");
                break;
            default:
                System.out.println("Not matching any case values");


        }

        aa:
        for(int i=1;i<=5;i++){
            bb:
            for(int j=1;j<=5;j++){
                if(i==2 && j==2){
                    break aa;
                }

                System.out.println(i+"  "+j);
            }
        }


        int k = 11;
        while(k<=10){
            System.out.println("k value in while loop" + k);
            k++;
        }

       do{
           System.out.println("k value in Do while loop" + k);
       }while (k<=10);



    }
}
