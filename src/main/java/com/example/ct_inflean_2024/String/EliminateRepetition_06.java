package com.example.ct_inflean_2024.String;

import java.util.Scanner;

public class EliminateRepetition_06 {
    public boolean isExists(String answer, char c){
        char[] answerArr = answer.toCharArray();
        for(char a: answerArr){
            if(a == c) return true;
        }
        return false;
    }

    public String solution(String input){
        String answer = "";
        char[] charArr = input.toCharArray();
        for(char c: charArr){
            if(!isExists(answer, c)){
                answer += c;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        EliminateRepetition_06 T = new EliminateRepetition_06();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));
    }
}
