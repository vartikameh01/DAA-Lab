import java.util.*;
class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
    

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);
        int key = sc.nextInt();

        int l = 0, h = n - 1, mid;
        while (l <= h) {
            mid = (l + h) / 2;
            if (a[mid] == key) {
                System.out.println("Found at index " + mid);
                return;
            } else if (a[mid] < key)
                l = mid + 1;
            else
                h = mid - 1;
        }
        System.out.println("Element not found");
    }
}
