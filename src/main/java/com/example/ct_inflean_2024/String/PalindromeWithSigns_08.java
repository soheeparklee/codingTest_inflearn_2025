package com.example.ct_inflean_2024.String;

import java.util.Scanner;

public class PalindromeWithSigns_08 {
/*
        public String solution(String input){
        int lt = 0;
        int rt = input.length() - 1;
        while(lt < rt){
            if(!Character.isAlphabetic(input.charAt(lt))){
                lt++;
                continue;
            }
            if(!Character.isAlphabetic(input.charAt(rt))){
                rt--;
                continue;
            }
            if(input.charAt(lt) != input.charAt(rt)){
                return "NO";
            }
            lt++;
            rt--;
        }

        return "YES";
    }
    */
    public String solution(String input){
        input = input.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        for(int i=0; i<input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length()-1-i)) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args){
        PalindromeWithSigns_08 T = new PalindromeWithSigns_08();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        System.out.println(T.solution(input));
    }
}
