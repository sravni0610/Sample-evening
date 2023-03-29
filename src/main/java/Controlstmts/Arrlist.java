package Controlstmts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Arrlist {

    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<String>();

        al.add("Ravi");
        al.add("Apple");
        al.add("Ravi");
        al.add("Blue");


        Iterator itr = al.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        HashSet<String> hs = new HashSet<String>();

        hs.add("Ravi");
        hs.add("Apple");
        hs.add("Ravi");
        hs.add("Blue");
        for (String data: hs) {

            System.out.println(data);


        }





    }
}
