/*
 * Дана коллекция имён.
 * 1) удалить все повторяющиеся имена из коллекции
 * 2) вывести коллекцию на экран
 * */

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();

        names.add("Анатолий");

        names.add("Георгий");

        names.add("Руслан");

        names.add("Георгий");

        names.add("Павел");

        names.add("Руслан");
        System.out.println(names);
        for (int i = 0; i < names.size() - 1; i++) {
            for (int j = i +1; j < names.size(); j++) {

                if (names.get(i) == names.get(j))

                    names.remove(j);

                 else;
            }
        }
        System.out.println(names);
    }
}
