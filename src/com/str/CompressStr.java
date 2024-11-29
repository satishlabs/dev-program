package com.str;

public class CompressStr {
    public static void main(String[] args) {
        String str = "abbbcc";
        String out = getCompress(str);
        System.out.println(out);
    }

    private static String getCompress(String str) {
        int count=1;
        char cc = str.charAt(0);
        String newStr = "";
        for(int i=1; i<str.length(); i++){
            if(cc == str.charAt(i)){
                count++;
            }else{
                if(count == 1){
                    newStr+= Character.toString(cc);
                }else{
                    newStr+= Character.toString(cc)+Integer.toString(count);
                }
                count=1;
            }
            cc = str.charAt(i);
        }
        //append the last character and its count
        if(count == 1){
            newStr+= Character.toString(cc);
        }else{
            newStr+= Character.toString(cc)+Integer.toString(count);
        }
        return newStr;
    }
}
