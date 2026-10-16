public class ZerosAtEnd {
    public static void main (String[] args) {

        int[] arr = {4,0,2,0,7};

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;

            }
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;

        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
