package assignment2.q1;
import assignment2.q1.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Question1{

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Bob", "123 street, India", 20000.0));
        list.add(new Employee(102, "Alice", "234 street, India", 30000.0));
        list.add(new Employee(103, "John", "345 street, India", 25000.0));
        list.add(new Employee(104, "Stuart", "456 street, India", 40000.0));

        Iterator<Employee> it = list.iterator();
        int searchId = 102;
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getId() == searchId)
                System.out.println(emp);
        }
    }

}