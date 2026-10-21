import java.util.Arrays;
public class NegativeNumbers {
    public static void main (String[] args) {

        int[] arr = {1, -2, 3, -4, 5, -6};

        int index = 0;

        for(int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0) {

               int temp = arr[index];
               arr[index] =arr[i];
               arr[i] = temp;

               index++;

                }
            }
        System.out.println(Arrays.toString(arr));        }
    }

