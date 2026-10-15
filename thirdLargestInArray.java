public class thirdLargestInArray {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 40, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            if (current > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = current;
            }
            else if (current > secondLargest && current < largest) {
                thirdLargest = secondLargest;
                secondLargest = current;
            }
            else if (current > thirdLargest && current < secondLargest) {
                thirdLargest = current;
            }
        }

        if (thirdLargest == Integer.MIN_VALUE) {
            System.out.println("Third largest distinct element does not exist.");
        } else {
            System.out.println("Third largest element is: " + thirdLargest);
        }
    }
}