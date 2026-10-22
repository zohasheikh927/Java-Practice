import java.util.Arrays;
public class RotateLeft {
    public static void main (String[] args) {

        int[] arr = {10,20,30,40,50};
        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i +1 ];
        }
        arr[arr.length - 1] = first;

        System.out.println(Arrays.toString(arr));
    }
}
