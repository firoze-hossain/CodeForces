package com.codeforces.array.evenArray;

import java.util.*;
public class EvenArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            int n=sc.nextInt();
            int a=0,b=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x%2 != i%2){
                    if(i%2 ==0){
                        a++;
                    }
                    else{
                        b++;
                    }
                }
            }
            if(a==b){
                System.out.println(b);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}