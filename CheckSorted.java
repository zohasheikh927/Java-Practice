public class CheckSorted {
    public static void main (String[] args) {

        int[] arr = {3, 7, 10, 6, 15};

        boolean sorted = true;
        for (int i = 0; i < arr.length-1 ; i++) {

            if( arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
            System.out.println("Sorted array is :" + sorted);
    }
}
