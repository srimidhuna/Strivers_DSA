import java.util.Scanner;

class Solution {

    public boolean isSorted(int[] arr, int n) {

        for (int i = 1; i < n; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sample Input:
        // 5
        // 1 2 3 4 5

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        System.out.println(obj.isSorted(arr, n));

        sc.close();
    }
}