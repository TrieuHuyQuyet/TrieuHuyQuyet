import java.util.LinkedHashSet;
import java.util.Set;
public class App60 {
    public static void main(String[] args) {
        Set<String> LinkedHashSet = new LinkedHashSet<String>();
        LinkedHashSet.add("Java");
        LinkedHashSet.add("C++");
        LinkedHashSet.add("Java");
        LinkedHashSet.add("PHP");
        for (String str : LinkedHashSet) {
            Symtem.out.println(str);
        }
    }
}