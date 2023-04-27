package comparation;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List <Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Batyrhan", "Batryhanov", 20000);
        Employee emp2 = new Employee(199, "Esen", "Esenov", 50000);
        Employee emp3 = new Employee(31, "Elina", "Elinova", 60000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting ");
        System.out.println( list);
        System.out.println("After sorting ");
        Collections.sort(list, new idComparator());
        System.out.println(list);
    }
}


class Employee
        implements Comparable<Employee>
{

    int id;
    String name;
    String surname;
    int salary;

    @Override
    public int compareTo(Employee employee) {
//        if (this.id == employee.id) {
//            return 0;
//        } else if(this.id < employee.id) {
//            return -1;
//        } else {
//            return 1;
//        }
        // or

//        return this .id - employee.id;

        //also
//        return this.name.compareTo(employee.name);

        //If both are similar
        int res= this.name.compareTo(employee.name);
        if (res==0) {
            res = this.surname.compareTo(employee.surname);
        }
        return res;
    }


    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}


class idComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        if (employee.id == t1.id) {
            return 0;
        } else if(employee.id < t1.id) {
            return -1;
        } else {
            return 1;
        }
    }
}