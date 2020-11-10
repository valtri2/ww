import java.util.Scanner;
/*
Задание: Дан массив с числами. 
Проверьте, что в этом массиве есть число 5. 
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
public class Main {

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Введи  число");
        int a = 1;
        int b = 1;
        a = myscan.nextInt();
        int[] number= new int[10];
        for(int i = 0; i < 10; i++){
            number[i] = i;
        }
        int c =1;
        for(int i = 0; i < 10; i++){
        c= i+1;
        if (c== a) {
            break;
        }
    }
        if ( c==a)
            System.out.println("true");
        else
                System.out.println("fals");      
        }
    }
