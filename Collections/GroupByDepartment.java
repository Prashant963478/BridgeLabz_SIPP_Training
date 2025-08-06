package collections_mapinterface_package;

import java.util.*;

class Employee {
    String name;
    String department;

    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
    	
        //Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        //Map to group by department
        Map<String, List<Employee>> groupedByDept = new HashMap<>();

        for (Employee emp : employees) {
            groupedByDept
                .computeIfAbsent(emp.department, k -> new ArrayList<>())
                .add(emp);
        }

        for (Map.Entry<String, List<Employee>> entry : groupedByDept.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
