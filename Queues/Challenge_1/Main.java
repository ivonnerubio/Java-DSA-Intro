package Queues.Challenge_1;

import java.util.*;

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

        string = string.toLowerCase(Locale.ROOT);
        string = string.replaceAll("[^a-zA-Z0-9]", "");

        LinkedList<String> stack = new LinkedList<String>();
        LinkedList<String> queue = new LinkedList<String>();
        for(int i=0; i<string.length(); i++) {
            stack.push(string.substring(i, i + 1));
            queue.addLast(string.substring(i, i + 1));

        }

        return stack.equals(queue);
    }
}
