import java.util.HashSet;
import java.util.Set;

public class task1 {

    /*
     * Напишите метод, который заполнит массив из 1000 элементов случайными цифрами
     * от 0 до 24.
     * Создайте метод, в который передайте заполненный выше массив и с помощью Set
     * вычислите процент уникальных
     * значений в данном массиве и верните его в виде числа с плавающей запятой.
     * Для вычисления процента используйте формулу: процент уникальных чисел =
     * = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    public static void main(String[] args) {
        int[] array = new int[1000];
        HashSet<Integer> myHashSet = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 25));
            System.out.print(array[i]);
        }

        for (int i : array) {
            myHashSet.add(i);
        }

        for (int i : myHashSet) {
            System.out.println(i);
        }

        double percent;
        System.out.println(myHashSet.size());
        System.out.println(array.length);
        percent = myHashSet.size() * 100.0 / array.length;
        System.out.println("Ammount of unique elements is " + percent + " %.");

        // для того, чтобы в ответе получить 2.5, а не 2.0, нужно одно из чисел
        // представить в виде числа с плавающей точкой (что я и сделала - 100.0)
    }
}