public class SmallestInArray {
    public static void main (String[] args){

        int[] arr = { 5, 3, 2,8};

        int smallest = arr[0] ;

        for (int i = 1; i < arr.length ; i++) {
            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest is : " +smallest);
    }
}
