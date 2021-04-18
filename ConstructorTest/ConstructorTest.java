package ConstructorTest;

/**
 * This program demonstrates object construction
 * @version 1. 01 20004-02-19
 * @author Dimas Kurniawan
 */

public class ConstructorTest {

    public static void main(String[] args) {

        //fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 400000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee(60000);

        //print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name = " +e.getName()+ "\nid = " + e.getId()+ "\nsalary = " +e.getSalary());
        }

    }
}