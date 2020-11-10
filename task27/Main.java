import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);
        System.out.println("Введи  число");
        int a = 1;
        int b = 1;
        a = myscan.nextInt();
                double c = 0;
        for (int i = 1; i < a - 1; i++) {
            //System.out.println("Строка №" + i);
            b = i + 1;
            c = a % b;

        if (c== 0) {
            //System.out.println("да");
           break;
            }
        }
        if (c ==0)
            System.out.println("false");
        else
            System.out.println("true");
        }
    }
