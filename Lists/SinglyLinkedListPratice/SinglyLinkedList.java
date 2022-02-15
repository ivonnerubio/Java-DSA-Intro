package Lists.SinglyLinkedListPratice;


public class SinglyLinkedList {
    public static void main(String[] args) {

        Employee janeDoe = new Employee("Jane", "Doe", 123);
        Employee johnJones = new Employee("John", "Jones", 324);
        Employee ivonneRubio = new Employee("ivonne", "rubio", 333);
        Employee mikeWilson = new Employee("Mike", "Wilson", 4344);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeDoe);
        list.addToFront(johnJones);
        list.addToFront(ivonneRubio);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();


    }
}
