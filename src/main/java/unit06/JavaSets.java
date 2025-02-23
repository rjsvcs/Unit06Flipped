package unit06;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSets {
    public static void main(String[] args) {
        Set<String> hash = new HashSet<>();
        hash.add("crispy");
        hash.add("dog");
        hash.add("elephant");
        hash.add("elephant");
        hash.add("monkey");
        hash.add("Zoo");
        hash.add("dog");
        for (String element : hash) {
            System.out.println(element);
        }

        Set<String> tree = new TreeSet<>();
        tree.add("Zoo");
        tree.add("elephant");
        tree.add("dog");
        tree.add("monkey");
        tree.add("crispy");
        tree.add("monkey");
        tree.add("dog");
        for (String element : tree) {
            System.out.println(element);
        }
    }
}
