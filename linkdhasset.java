package collections;
import java.util.*;
public class linkdhasset {
	public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(Arrays.asList("pavan", "vishnu","ram"));

        Iterator<String> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}