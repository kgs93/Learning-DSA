package BinarySearch;

import java.util.Arrays;

public class Floor_and_Celing_of_a_number{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int[] ans = findNumber(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return new int[]{arr[end],-1};
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return new int[] {arr[mid],arr[mid]};
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return new int[] {arr[end],arr[start]};
    }
}
