/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<String>();
        while (true) {
            String family = scanner.nextLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }
        System.out.println(list);

        String city = scanner.nextLine();
int i = 0;
        for (i=0;  i < list.size() ;i++){
            if (city.equals(list.get(i))){

               System.out.println(city);
                System.out.println(list.get(i+1));

            }
            else ;

        }
    }
}
