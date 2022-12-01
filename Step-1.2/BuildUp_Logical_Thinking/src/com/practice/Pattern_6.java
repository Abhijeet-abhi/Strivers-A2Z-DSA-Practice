//Question
//https://practice.geeksforgeeks.org/problems/triangle-number-1661489840/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_6
package com.practice;

import java.util.Scanner;

public class Pattern_6 {
	void printTriangle(int n) {
		for (int i = n; i >= 1; i--) {
			String bag = "";
			for (int j = 1; j <= i; j++) {
				if (j == n)
					bag += j;
				else
					bag += j + " ";
			}
			System.out.println(bag);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many * your wanted to print: ");
		int num = scn.nextInt();
		Pattern_6 p6 = new Pattern_6();
		p6.printTriangle(num);
		scn.close();

	}

}
