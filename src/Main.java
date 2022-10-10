import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание-1");
        System.out.println("Задание-1,2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        int number1 = numbers[0];
        int number2 = numbers[1];
        int number3 = numbers[2];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
             if(i < numbers.length - 1) {
                 System.out.print(",");
             }
        }
        System.out.println();


        double[] fraction = {1.57, 7.654, 9.986};
        for (int u = 0; u < fraction.length; u++) {
            System.out.print(fraction[u]);
            if(u < fraction.length -1){
                System.out.print(",");
            }
        }
        System.out.println("");

        int[] train = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int w = 0; w < train.length; w++) {
            System.out.print(train[w]);
            if(w < train.length -1){
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("Задание-2,3");
        int[] shop = new int[3];
        int applesBox = shop[0];
        int pearsBox = shop[1];
        int tomatoesBox = shop[2];
        shop[0] = 1;
        shop[1] = 2;
        shop[2] = 3;
        for (int i = shop.length-1; i >= 0 ; i--) {
            System.out.print(shop[i]);
            if (i > shop.length -3) {
                System.out.print(",");
            }
        }
        System.out.println();



        double[] personnel1 = {1.57, 7.654, 9.986};
        for (int i = personnel1.length-1; i >= 0 ; i--) {
            System.out.print(personnel1[i]);
            if (i > personnel1.length-3) {
                System.out.print(",");
            }
        }
        System.out.println();


        int[] trainNew = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};



        for (int i = trainNew.length-1; i >= 0 ; i--) {
            System.out.print(trainNew[i]);
            if (i > trainNew.length -10) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("Задание-3,4");
        int[] numberS = new int[3];
        numberS[0] = 1;
        numberS[1] = 2;
        numberS[2] = 3;
        int numberOne = numbers[0];
        int numberTwo = numbers[1];
        int numberThree = numbers[2];
        for (int t = 0; t < numberS.length; t++) {
         if(numberS[t] % 2 != 0){
             numberS[t] += 1;
         }
        }
        System.out.println(Arrays.toString(numberS));







    }
}