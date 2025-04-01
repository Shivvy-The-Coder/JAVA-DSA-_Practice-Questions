import java.util.Scanner;

public class SumExcept_itself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pre = 0, pro = 0;
        int l[] = new int[n];
        int r[] = new int[n];

        int x = n - 1;
        for (int i = 0; i < n; i++) {
            l[i] = pre;
            pre += arr[i];
            r[x] = pro;
            pro += arr[x];
            x--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = l[i] + r[i];
            System.out.print(arr[i] + " ");
        }
    }

}
