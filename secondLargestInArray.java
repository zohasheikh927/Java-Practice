public class secondLargestInArray {
    public static void main (String[] args) {

        int[] arr = {10, 25, 7, 40, 30};

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length ; i++) {
            int current = arr[i];

            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current < largest && current > secondLargest) {
                secondLargest = current;
            }
        }
        System.out.println("Second largest number is :" +secondLargest);
        }
    }

