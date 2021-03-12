import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lab_3{
    public static void main(String[] args) {
        Random rrr = new Random();
        Scanner in = new Scanner(System.in);
        int[] array;
        System.out.println("Input sequence length :");
        int length = in.nextInt();
        array = new int[length];
        int a = rrr.nextInt(30);
        int b = rrr.nextInt(30);
        if(a > b) {
            for (int i = 0; i < length; i++) {
                array[i] = b + rrr.nextInt(a - b + 1);
            }
        }
        else {
            for(int i = 0; i < length; i++ ){
                array[i] = a + rrr.nextInt(b - a + 1);
            }
        }
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        int min = array[0];
        System.out.println(min);
        newArray(array, min, length);
    }
    public static void bubbleSort(int[] array) {
        int a = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
    }
    public static void newArray(int[] array, int min, int length){
        int[] ArrayNew;
        int c = 0, x = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == min) {
                c++;
            }
        }
        ArrayNew = new int[length - c];
        for (int i = 0; i < length; i++) {
            if(array[i] == min){
                continue;
            }
            ArrayNew[x] = array[i];
            x++;
        }
        System.out.println(Arrays.toString(ArrayNew));
    }
}