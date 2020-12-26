/*

1. Ввести путь к файлу с консоли.

2. Прочитать из него набор чисел.

3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:

5

8

-2

11

3

-5

2

10

Пример вывода:

-2

2

8

10

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        int[] array = null;
        try
                ( BufferedReader reader = new BufferedReader(new FileReader("C://java/test2.txt")))

            {
                array = reader.lines().mapToInt(Integer::parseInt).toArray();
            }
             catch(IOException | NumberFormatException e)
            {
                e.printStackTrace();

            }
            if (array != null) {
                int max ;
                  Arrays.sort(array);
                for (int i = 0; i < array.length; i++)
                {
                        max = array[i];
                        if (max%2 == 0)
                    System.out.println( max);

                }


            }

        }

    }
