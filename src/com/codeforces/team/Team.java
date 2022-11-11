package com.codeforces.team;

import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int result = 0;
		while (test-- > 0) {
			result += (sc.nextInt() + sc.nextInt() + sc.nextInt()) > 1 ? 1 : 0;
		}
		System.out.println(result);
	}
}