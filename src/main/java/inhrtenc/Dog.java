package inhrtenc;

public class Dog extends Animal{

    void bark(){
        System.out.println("Dogs bark");
    }

    void eat(){
        System.out.println("Dogs eat");
    }

    public static void main(String args[]){

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }

}
