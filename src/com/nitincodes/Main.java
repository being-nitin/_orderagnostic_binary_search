package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// we use agnostic binary search , when its not mentioned that the array is sorted in ascending or descending:
    int[] arr = {12,13,14,15,16,17,18};
    int ans = orderAgnosticBS(arr,17);
        System.out.println("the target element is: "+ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else if(target>arr[mid]){
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }

            }
        }
        return -1;
    }
}
