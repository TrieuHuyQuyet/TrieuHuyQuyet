import Java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //doi tuong su dung de nhap xuat trong Java
        Scanner sc = new Scanner(System.in)
        //khai bao bien de nhap gia tri vao he thong
        String strHoTen = "";
        System.out.println("Nhap ho ten: ");
        //gan gia tri nhap vao cho bien strHoTen
        strHoTen = sc.nextline();
        System.out.println("Xin Chao" + strHoTen)
    }
}