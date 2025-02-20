package unit06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlienComparator implements Comparator<AlienAlphabet> {
    @Override
    public int compare(AlienAlphabet a, AlienAlphabet b) {
        return a.getSymbol().compareTo(b.getSymbol());
    }

    public static void main(String[] args) {
        List<AlienAlphabet> list = new ArrayList<>();
        list.add(new AlienAlphabet(5, "[-|-]"));
        list.add(new AlienAlphabet(2, "{-|-}"));
        list.add(new AlienAlphabet(1, ">--<"));
        list.add(new AlienAlphabet(6, "()()"));

        Collections.sort(list, new AlienComparator());

        for (AlienAlphabet alphabet : list) {
            System.out.println(alphabet);
        }
    }
    
}
