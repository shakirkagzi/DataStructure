package myDataStructure;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/**
 * Created by Shakir on 8/10/2016.
 */
public class MyuseArrayList {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());
        al.add("First");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");
        al.add(1, "A2");
        System.out.println("Size of arrays after additions: " + al.size());
        System.out.println(" Arrays: "+al);

        al.remove("Four");
        System.out.println("After Deletion of Element Four");
        System.out.println(al);

        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of Arrays: " + al);
        System.out.println(al.indexOf("Five"));
    }
}
