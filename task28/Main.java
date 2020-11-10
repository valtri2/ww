public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};
        int a = numbers[0];
        int c =1;
        for (int i = 0; i < numbers.length; i++) {
          c=  numbers[i]*c;
        }

        System.out.println(c);
    }
}
