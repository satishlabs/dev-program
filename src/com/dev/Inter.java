package com.dev.inter;

import java.util.Arrays;

class TripletSum {
    public static void main(String[] args) {
        int[] arr= {10,15,8,5,12,7};
        int sum = 30;
        /*int[] arr = new int[]{ 0, -1, 2, -3, 1,3,-2,5 };
        int sum=0;*/

        findTripletSum(arr, sum);
    }

    private static void findTripletSum(int[] arr, int sum) {
        int n = arr.length;
        Arrays.sort(arr);

        for(int i=0; i<n-1; i++){
            int l= i+1;
            int m=n-1;
            int x = arr[i];
            while(l<m){
            if(x+arr[l]+arr[m] == sum){
                System.out.println(x+", "+arr[l]+", "+arr[m]+" = "+sum);
                l++;
                m--;
            }else if(x+arr[l]+arr[m]< sum){
                l++;
            }{
                m--;
            }
        }
        }
    }
}
