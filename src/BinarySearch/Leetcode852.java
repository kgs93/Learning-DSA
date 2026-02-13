package BinarySearch;

public class Leetcode852 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 5, 9, 0};
        System.out.println(peakElement(arr));
    }
    static int peakElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
