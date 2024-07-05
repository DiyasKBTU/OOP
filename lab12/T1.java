package lab12;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class T1 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>(List.of("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		Set<String> set1 = new LinkedHashSet<>(l1);
		List<String> l2 = new ArrayList<>(List.of("George", "Katie", "Kevin", "Michelle", "Ryan"));
		Set<String> set2 = new LinkedHashSet<>(l2);
		System.out.println(set1);
		System.out.println(set2);
		//union
		Set<String> union = new LinkedHashSet<>(set1);
		union.addAll(set2);
		System.out.println(union);
		
		//difference
		Set<String> diff = new LinkedHashSet<>(set1);
		diff.removeAll(set2);
        System.out.println(diff);
        
        //intersection
        Set<String> inter = new LinkedHashSet<>(set1);
        inter.retainAll(set2);
        System.out.println(inter);
	}

}
