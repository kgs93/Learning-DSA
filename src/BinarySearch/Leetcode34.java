package BinarySearch;

import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[] args){
        int[] arr={5,7,7,7,7,8,8,10};
        int target=6;
        int[] index={-1,-1};
        index[0]=firstOccurance(arr,target);
        index[1]=secondOccurance(arr,target);
        System.out.println(Arrays.toString(index));
    }
    static int firstOccurance(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                index=mid;
                end=mid-1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
    static int secondOccurance(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
        }
}
