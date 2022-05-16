import java.util.HashSet;
import java.util.Scanner;
public class App54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(Symtem.in);

        HashSetString.add(0);
        HashSetString.add(3);
        HashSetString.add(1);
        HashSetString.add(4);
        HashSetString.add(2);
        HashSetString.add(8);
        Symtem.out.println("các phần tử trong HashSetInteger: ");
        Symtem.out.println(HashSetInteger);
        Symtem.out.println("Nhập phần tử cần thêm: ");
        if (!HashSetInteger.contains(number)) {
            HashSetInteger.remove(number);
            Symtem.out.println("thêm thành công! ");
            Symtem.out.println("các phần tử trong hashSetInteger sau khi thêm: ");
            Symtem.out.println(HashSetInteger);
        } else {
            Symtem.out.println("Phần tử" + number + "đã tồn tại!");
        }
    }
}