public class CountEvenOdd {
    public static void main (String[] args) {
         int[] arr = { 2 , 4, 7, 8 , 3, 1 , 10 };

         int even = 0;
         int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
            else if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Even numbers :" +even);
        System.out.println("Odd numbers :" +odd);

    }
}
