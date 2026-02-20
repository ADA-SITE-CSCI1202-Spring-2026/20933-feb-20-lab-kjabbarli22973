import java.util.Scanner;

public class Greatestsmallest {

    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

   
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

   
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        
        if (args.length > 0) {
            int[] arr = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            System.out.println("From command line:");
            System.out.println("Min: " + findMin(arr));
            System.out.println("Max: " + findMax(arr));
        }

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("From Scanner:");
        System.out.println("Min: " + findMin(arr2));
        System.out.println("Max: " + findMax(arr2));

        
        int[] result = findMinMax(arr2);
        System.out.println("Both -> Min: " + result[0] + ", Max: " + result[1]);

        sc.close();
    }
}