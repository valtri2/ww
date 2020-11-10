/*

Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.

*/
public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6};
        int f = 0;
int a =0;
      //  int i ;
        for (int i = 0; i < numbers.length ; i++) {
            a=numbers[i] +a;
          //  System.out.println(a);
            if (a>10)
                break;
            f = i+2;
        }
            System.out.println(f);

           }
}
