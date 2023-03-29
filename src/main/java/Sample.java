public class Sample {

    public static void main (String args[]){

        System.out.println("First example");

        int a;
        int b;
        float c=10.5f;

        double d = 100.9389;
        b=30;

        a = 15;

        int h = (a<b) ? a:b;

        boolean e = (a > b);
        boolean f = (a<b);
        boolean g = (a==b);






        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);

        System.out.println(!(e || f));
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(((a>b)?("A is Greater than B"):("A is Less than B")));

        // operators in java
        // Arithmetic  (+,-,*,/), Relational(<, >,<=,>=,==,!=), logical(&&, ||, !), ternary   (cond) ? True value  : False value

    }
}
