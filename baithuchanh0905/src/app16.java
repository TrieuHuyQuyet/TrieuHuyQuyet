public class App16 {
    public static void main(String[] args) 
        Arraylisst<String> arrListString = new Arraylisst<>();

        arrListString.add("JAVA");
        arrListString.add("PHP");
        arrListString.add("c#");
        arrListString.add("C++");

        System.out.println("các phần tử trong arrListString là: ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }
    }