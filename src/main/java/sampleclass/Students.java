package sampleclass;

public class Students {

    // data members

    int id;
    String name;
    int age;

    static String subject = "Testing";

    Students(){

    }

    Students(int id, String name){
        this.id =id;
        this.name = name;
    }
    Students(int i, String n,int a){
        id =i;
        name = n;
        age = a;
    }

    Students(Students s){
        id = s.id;
        name = s.name;
        age = s.age;
    }

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);

    }

    void insert(int i, String n){

        id = i;
        name = n;

    }

    public static void main(String [] args){

        // Classname <obj-name> = new classname();

        Students s1 = new Students();
        s1.display();
        s1.insert(101,"Prathiba");
        s1.display();
        Students s2 = new Students();
        s2.id = s1.id;
        s2.name = s1.name;
        s2.display();
        Students s3 = new Students(103,"hh",30);
        s3.display();
        Students s4 = new Students(s1);
        s4.display();
        System.out.println(s2.subject);

        Students s5 = new Students(105,"Raj");
        s5.display();



    }

}
