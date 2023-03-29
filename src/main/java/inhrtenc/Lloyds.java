package inhrtenc;

public class Lloyds extends  Bank{

    int getRateofinterest(){
        return  6;
    }
    public static void main(String args[]){

        Lloyds l1 = new Lloyds();
        System.out.println("Interest of the bank is "+l1.getRateofinterest());
    }

}
