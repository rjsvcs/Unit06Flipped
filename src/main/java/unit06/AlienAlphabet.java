package unit06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlienAlphabet implements Comparable<AlienAlphabet> {
    private final int sequenceNumber;
    private final String symbol;

    public AlienAlphabet(int sequenceNumber, String symbol) {
        this.sequenceNumber = sequenceNumber;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlienAlphabet other) {
            return this.sequenceNumber == other.sequenceNumber &&
                this.symbol.equals(other.symbol);
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(AlienAlphabet other) {
        return this.sequenceNumber - other.sequenceNumber;
    }

    @Override
    public String toString() {
        return this.sequenceNumber + ": " + this.symbol;
    }
    
    public static void main(String[] args) {
        List<AlienAlphabet> list = new ArrayList<>();
        list.add(new AlienAlphabet(5, "[-|-]"));
        list.add(new AlienAlphabet(2, "{-|-}"));
        list.add(new AlienAlphabet(1, ">--<"));
        list.add(new AlienAlphabet(6, "()()"));

        Collections.sort(list);

        for (AlienAlphabet alphabet : list) {
            System.out.println(alphabet);
        }
    }
}
