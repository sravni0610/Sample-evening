package inhrtenc;

public class Employee {
    Double salary = 10500.50;

    void display(){
        System.out.println("displaye method");
    }

    public static void main (String args[]){

        Employee e1 = new Employee();

        System.out.println("Salary of an employee is "+e1.salary);

    }
}


// class sub-class-name  extends  superclass-name