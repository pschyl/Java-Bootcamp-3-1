import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }
        //System.out.println(sum);

        System.out.println("-------------------");

        int max = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println(max);

        int[] array2 = {11,12,13,14,15,16,17,18,19,20};
        int[] array3 = new int[10];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        System.out.println(Arrays.toString(array3));

        System.out.println("------------------");

    }

}