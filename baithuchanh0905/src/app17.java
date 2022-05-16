public class app17 {
    public static void main(String[] args) {
        Arraylisst<Integer> arrListinteger = new Arraylist<>();
    
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);
        
        System.out.println("các phần tử có trong arrListInteger là: ");
        for (int number : arrListInteger) {
            System.out.print(number + "\t");
        }
    }