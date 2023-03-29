package Controlstmts;

public class Sample3 {

    public static void main(String args[])
    {

        try {
            int arr[];

            arr = new int[5];

            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[4] = 40;
            arr[3] = 50;
            //arr[5] = 60;
            System.out.println(arr[4]);

        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound exception");
        }

        finally {
            System.out.println("Execute array details");
        }


//        System.out.println(arr.length);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//
//        int a[] = {20,25,26,27,28,3943};
//        System.out.println(a.length);
//
//        for(int i : a){
//            System.out.println(i);
//        }


//
//        int arr1[][] = {{10,20,30},{40,50,60},{87,9,30,30}};
//
////        arr1[0][0] = 10;
////        arr1[0][1] = 20;
////        arr1[0][2] = 30;
////        arr1[1][0] = 40;
////        arr1[1][1] = 50;
////        arr1[1][2] = 60;
////        arr1[2][0] = 70;
////        arr1[2][1] = 80;
////        arr1[2][2] = 90;
//
//        for(int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                System.out.println(arr1[i][j]+ "  ");
//            }
//        }


    }
}
