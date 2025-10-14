package com.example.ct_inflean_2024.String;

import java.lang.reflect.Array;
import java.util.Scanner;

public class FlipWord_04 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        String[] strArr = new String[num];

        for(int i=0; i<num; i++){
            strArr[i] = sc.next();
        }

        for(String s: strArr){
            StringBuffer sb = new StringBuffer();
            sb.append(s);
            System.out.println(sb.reverse());
        }
    }
}
