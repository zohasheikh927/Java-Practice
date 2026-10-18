public class SecondSmallestInArray {
    public static void main (String[] args) {

        int[] arr = {15, 4, 25, 3, 12};

        int current = 0;
        int smallest = arr[0];
        int SecondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            current = arr[i];

          if(current < smallest ) {
              SecondSmallest = smallest;
              smallest = current ;

          } else if (current > smallest && current < SecondSmallest) {
              SecondSmallest = current;
          }
        }
        System.out.println("second smallest element is " +SecondSmallest);

    }
}
