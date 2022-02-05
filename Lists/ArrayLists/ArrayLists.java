package Lists.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Doe", 123));
        employeeList.add(new Employee("John", "Jones", 324));
        employeeList.add(new Employee("ivonne", "rubio", 333));
        employeeList.add(new Employee("Mike", "Wilson", 4344));

        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("Doug", "Smith", 3444));

        System.out.println(employeeList.size());
        employeeList.add(3, new Employee("Jackson", "Michael", 4232));
        employeeList.forEach(employee -> System.out.println(employee));


        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);


        System.out.println(employeeList.contains(new Employee("Jane", "Doe",123)));

        System.out.println(employeeList.indexOf(new Employee("Doug","Smith", 3444)));

        employeeList.remove(2);
        for(Employee employee: employeeArray){
            System.out.println(employee);
        }
    }
}
