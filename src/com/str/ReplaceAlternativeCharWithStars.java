package com.str;

public class ReplaceAlternativeCharWithStars {
    public static void main(String[] args) {
        String str ="Satish";
        char arr[] = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            int x = i%2;
            if(x!=0){
                sb.append("*");
            }else{
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
