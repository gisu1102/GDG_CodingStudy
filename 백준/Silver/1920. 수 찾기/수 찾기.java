import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            if (Arrays.binarySearch(arr, scanner.nextInt()) >= 0) {
                System.out.println(1);
            }
            else {System.out.println(0);}
        }



    }
}