package com.example.ct_inflean_2024.String;

import java.util.Scanner;

public class FlipSomeParts_05 {
    public String solution(String input){
        char[] charArr = input.toCharArray();
        String answer;

        int lt = 0;
        int rt = input.length()-1;

        while(lt < rt){
            char l = input.charAt(lt);
            char r = input.charAt(rt);
            if(!Character.isAlphabetic(l)){
                lt++;
            }else if(!Character.isAlphabetic(r)){
                rt--;
            }else{
                charArr[lt] = r;
                charArr[rt] = l;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }


    public static void main(String[] args) {
        FlipSomeParts_05 T = new FlipSomeParts_05();
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));
    }
}
