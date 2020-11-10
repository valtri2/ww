import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// 'это сам'
       
        Scanner myscan = new Scanner(System.in);
        System.out.println("Введи  число");
        int a = 10;
        int b = 1;
        b = myscan.nextInt();
        int c;
        c = a % b;
        System.out.println(c == 0 ? "без остатка" : "с остатком = " +  c);
    }
}
