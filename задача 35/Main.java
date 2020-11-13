 /*
Задание: Дан массив с числами. Выведите последовательно
 его элементы используя рекурсию и не используя цикл.
*/
public class Main {

    public static void main(String[] args) {
        int[] num = {4, 2, 6, 2, 65};
  /*   int a = num.length;
        System.out.println(num.length);
        for (int i = 0; i < a; i++) {
            System.out.print(num[i]);
        }*/
        int index =0;  //????
        showItems(num, index);
    }
    public static void showItems(int num[], int index) {
        if (index < num.length) {
            System.out.println(num[index]);
            index++;
            showItems(num, index);
        }
    }
}
