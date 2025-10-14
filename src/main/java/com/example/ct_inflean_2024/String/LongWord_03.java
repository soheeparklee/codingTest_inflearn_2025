package com.example.ct_inflean_2024.String;

import java.util.Scanner;

public class LongWord_03 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        String[] strArr = input.split( " ");

        int max = 0;
        String answer = "";
        for(String s : strArr){
            int count = s.length();
            if(count > max){
                max = count;
                answer = s;
            }
        }
        System.out.println(answer);

    }
}
