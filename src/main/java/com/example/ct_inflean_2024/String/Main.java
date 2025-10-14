package com.example.ct_inflean_2024.String;

import java.util.*;


class Main {

    static int n;
    static int finalNum;

    static int[] answer; //1~n까지의 값 저장
    static int[] ch; //1~n까지의 값 저장할 때 중복여부 확인

    static int[] combiArr; //순열 저장

    boolean flag = false; //값 찾으면 끝내기

    int[][] combiMemo = new int[35][35]; //메모이제이션

    public int combi(int n, int r) { //nCr
        if(combiMemo[n][r] >0) return combiMemo[n][r];
        if(n==r || r==0) return 1;
        else{
            return combiMemo[n][r] = combi(n-1, r-1) + combi(n-1, r);
        }

    }


        public void DFS(int L, int sum) {
        if(flag) return;
        if(L==n){ //complete
            if(sum == finalNum){
                for(int x: answer){
                    System.out.print(x+" ");
                    flag= true;
                }
            }
        }
        else{ //not complete
            for(int i=1; i<=n; i++){
                if(ch[i] ==0 ){
                    ch[i]=1;
                    answer[L] = i;
                    DFS(L+1, sum+ answer[L]*combiArr[L]);
                    ch[i]=0;


                }
            }

        }

        }

        public static void main(String[] args) {
            Main T = new Main();
            Scanner sc = new Scanner(System.in);
            n= sc.nextInt();
            finalNum = sc.nextInt();
            answer= new int[n];
            combiArr= new int[n];
            ch= new int[n+1];

            for(int i=0; i<n; i++){
                combiArr[i]= T.combi(n-1, i);
            }
            T.DFS(0, 0);

        }
}

