import java.util.ArrayList;
import java.util.Scanner;

class ProductExcept_Itself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l[] = new int[n];
        int r[] = new int[n];
        int pre = 1, pro = 1;
        int x = n - 1;
        for (int i = 0; i < n; i++) {
            l[i] = pre;
            pre *= arr[i];
            r[x] = pro;
            pro *= arr[x];
            x--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = l[i] * r[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}