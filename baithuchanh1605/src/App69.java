import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
public class App69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner scanner = new Scanner(Symtem.in);
        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);
        Symtem.out.println("các phần tử trong treeSetInteger: ");
        Symtem.out.println(treeSetInteger);
        Symtem.out.println("Nhập phần tử cần thêm: ");
        number = scanner.nextInt();
        if