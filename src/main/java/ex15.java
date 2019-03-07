public class ex15 {
    public static void main(String[] args) {
        int arr[] = {1, 11, 3, 7, 5, 2, 4, 6, 9, 10, 8};
        int i;
        int j;
        int t;

        for (i = arr.length-1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}

