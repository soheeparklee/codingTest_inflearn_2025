package com.example.ct_inflean_2024.String;

import java.util.Scanner;

public class ChangeCapital_02 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c >= 65 && c <= 90) c +=32;
            else c -=32;
            result +=c;
        }
        System.out.println(result);
    }
}
