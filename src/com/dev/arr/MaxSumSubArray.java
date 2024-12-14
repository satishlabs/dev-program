package com.dev.arr;

public class MaxSumSubArray {
    public static void main(String[] args) {
       // int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        //output: 4+(-1)+2+1=6
        int arr[] = {12,5,3,10,2,4,6,20};
        int res = maxSumSubArray(arr);
        System.out.println(res);
    }

    private static int maxSumSubArray(int[] arr) {
        if(arr.length==1)
            return arr[0];

        Integer max = Integer.MIN_VALUE;
        Integer sum = 0;

        int startIndex = 0;
        int endIndex = arr.length-1;

        while(startIndex < endIndex){
            sum = sum + arr[startIndex++];

            if(max < sum){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}
