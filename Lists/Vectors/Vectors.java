package Lists.Vectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vectors {


    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Doe", 123));
        employeeList.add(new Employee("John", "Jones", 324));
        employeeList.add(new Employee("ivonne", "rubio", 333));
        employeeList.add(new Employee("Mike", "Wilson", 4344));
    }
}