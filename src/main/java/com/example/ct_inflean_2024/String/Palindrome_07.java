package com.example.ct_inflean_2024.String;

import java.util.Scanner;

public class Palindrome_07 {
    public String solution(String input){
        String reverse = new StringBuffer(input).reverse().toString();
        if(input.equals(reverse)) return "YES";

        return "NO";
    }
    public static void main(String[] args){
        Palindrome_07 T = new Palindrome_07();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        System.out.println(T.solution(input));
    }
}
