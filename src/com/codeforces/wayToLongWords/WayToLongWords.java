package com.codeforces.wayToLongWords;

import java.util.Scanner;

public class WayToLongWords {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=Integer.parseInt(sc.nextLine());
            while(n-->0){
                String st=sc.nextLine();
                int length=st.length();
                if(length<11){
                    System.out.println(st);
                }
                else{
                    System.out.println(""+st.charAt(0)+(length-2)+st.charAt(length-1));
                }
            }
        }


}
