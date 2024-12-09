package com.dev.arr;

//(-2)*(-40) = 80

public class MaxProductSubArray {
    public static void main(String[] args) {
        int arr[] = {5,-2,3,6,0,-2,-40};
        int res = maxProductSubArray(arr);
        System.out.println(res);
    }

    public static int maxProductSubArray(int[] arr) {
        //Edge case: empty array
        if(arr.length == 0
        ) return 0;

        //Edge case: Single element array
        if(arr.length == 1) return arr[0];

        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for(int i=1; i<arr.length; i++){
            //Swap when the current number in negative
            if(arr[i]<0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            //Update maxProduct and minProduct
            maxProduct = Math.max(arr[i], maxProduct*arr[i]);
            minProduct = Math.min(arr[i], minProduct*arr[i]);

            //Update the overall result
            result = Math.max(result, maxProduct);
        } //for loop ends (O(n)

        return result;
    }
}
