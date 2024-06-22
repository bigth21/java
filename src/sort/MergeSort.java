package sort;

public class MergeSort {
    private static int[] sorted;

    public static void sort(int[] a) {
        if (a == null || a.length < 1)
            return;

        sorted = new int[a.length];
        sort(a, 0, a.length - 1);
        sorted = null;
    }

    private static void sort(int[] a, int left, int right) {
        if (left == right)
            return;

        int mid = (left + right) / 2;
        sort(a, left, mid);
        sort(a, mid + 1, right);

        merge(a, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {
            if (a[l] <= a[r]) {
                sorted[idx++] = a[l++];
            } else {
                sorted[idx++] = a[r++];
            }
        }

        if (l > mid) {
            while (r <= right) {
                sorted[idx++] = a[r++];
            }
        } else {
            while (l <= mid) {
                sorted[idx++] = a[l++];
            }
        }

        System.arraycopy(sorted, left, a, left, right - left + 1);
    }
}
