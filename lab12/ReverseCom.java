package lab12;
import java.util.Comparator;

public class ReverseCom implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b.compareTo(a); 
    }
}