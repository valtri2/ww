/*
Задание: Дан массив с числами. Проверьте,
есть ли в нем два одинаковых числа подряд.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};
        boolean f = false;

        for (int i = 0; i < numbers.length -1; i++) {
            if (numbers[i]== numbers[i+1])
                
                f = true;
                break;
        }
        if (f)
            System.out.println("да");
        else
            System.out.println("нет");

           }
}
