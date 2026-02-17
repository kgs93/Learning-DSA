package BinarySearch;

public class Leetcode35 {
    public static void main(String[] args){
        int[] arr={3,6,10,20,30,50};
        int target=14;
        Solution soln=new Solution();
        int nearestNeighbour= soln.searchInsert(arr,target);
        System.out.println(nearestNeighbour);
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length;
        while(start!=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return start;
    }
}
