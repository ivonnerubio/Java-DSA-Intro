package Stacks.StacksChallenge;

import Stacks.LinkedStack.Employee;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        string = string.toLowerCase();
        string = string.replaceAll("[^a-zA-Z0-9]", "");
        LinkedList stack  = new LinkedList();
        for(int i=0; i<=string.length()-1; i++){
            stack.push(string.charAt(i));
        }

        String newStr = "";
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
             newStr += iterator.next();
        }

        return newStr.equals(string);
    }
}
