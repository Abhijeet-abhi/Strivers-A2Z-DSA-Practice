//Question
//https://practice.geeksforgeeks.org/problems/triangle-number/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_3
package com.practice;

import java.util.Scanner;

public class Pattern_3 {
	void printTriangle(int n) {
		String bag = "";
		for (int i = 1; i <= n; i++) {
			if (i == n)
				bag += i;
			else
				bag += i + " ";
			System.out.println(bag);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many * your wanted to print: ");
		int num = scn.nextInt();
		Pattern_3 p3 = new Pattern_3();
		p3.printTriangle(num);
		scn.close();
	}

}
