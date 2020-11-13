public class Main {
/*

Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример вывода на экран:

8

88

888

8888

88888

888888

8888888

88888888

888888888

8888888888

*/
    public static void main(String[] args) {
// спасибо инету
        int[][] a1 = new int[10][];
        a1[0] = new int [1];
        a1[1] = new int [2];
        a1[2] = new int [3];
        a1[3] = new int [4];
        a1[4] = new int [5];
        a1[5] = new int [6];
        a1[6] = new int [7];
        a1[7] = new int [8];
        a1[8] = new int [9];
        a1[9] = new int [10];
        for(int i = 0; i<a1.length; i++){
            for(int j = 0; j<a1[i].length; j++){
                System.out.print( "8");
            }
            System.out.println();
                    }

            }

        }
