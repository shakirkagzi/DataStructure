package myDataStructure;

import java.util.LinkedList;

/**
 * Created by Shakir on 8/10/2016.
 */
public class MyuseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("USA");
        list.add("UK");
        list.add("India");

        System.out.println("Original contents of list: " + list);
        System.out.println("After Removing..");
        list.remove("UK");
        System.out.println("Original contents of list: " + list);
        list .add("Japan");
        System.out.println("Original contents of list: " + list);
        list.removeFirst();
        System.out.println("Remove First one");
        System.out.printf("Original contents of list: "+list);
    }
}
