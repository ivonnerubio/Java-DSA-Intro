package HashTables.HashTableChallenge;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("Janes", "Smith", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Ivonne", "Rubio", 123));

        Iterator<Employee> employeeIterator = employees.iterator();
        Map<Integer,Employee> hashMap = new HashMap<Integer,Employee>();
        List<Employee> remove = new ArrayList<>();

        while (employeeIterator.hasNext()) {
            Employee current = employeeIterator.next();
            if(!hashMap.containsKey(current.getId())){
                hashMap.put(current.getId(), current);
            }
            else{
                remove.add(current);
            }
        }

        for(Employee employee: remove){
            employees.remove(employee);
        }

        employees.forEach(e -> System.out.println(e));


    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
