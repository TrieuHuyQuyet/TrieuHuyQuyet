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
        if (!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            Symtem.out.println("thêm thành công");
            Symtem.out.println("các phần tử có trong treesetinteger là: " + treeSetInteger);
            number = sc.nextInt();
            if(!treesetinteger.contains(number)) {
                treesetinteger.add(number);
                System.out.println("them thanh cong");
                System.out.println("cac phan tu co trong treesetinteger la: "+treesetinteger);
            }
            else {
                System.out.println("phan tu da ton tai");
            }
        }
    }
}