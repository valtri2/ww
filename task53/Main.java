
/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное чисо не больше 10 ");
        List<String> list = new ArrayList<String>();
        
                while (true) {
            int na = scanner.nextInt();
            System.out.println("The output string is: " + na);

            if ( na<10&&na>0 )                
                 System.out.println(" правильное число");
                         else
            System.out.println("Не правильное число");
            if  (na>10||na<0) {
                System.out.println("Коллекция");
                break;
            }
            String str1 = Integer.toString(na);
            list.add(str1);
            System.out.println(list);
        }
        System.out.println(list);
    }
}
