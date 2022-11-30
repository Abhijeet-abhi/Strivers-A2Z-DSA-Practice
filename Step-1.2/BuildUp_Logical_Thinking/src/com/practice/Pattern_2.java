//Question
//https://practice.geeksforgeeks.org/problems/right-triangle/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_2
package com.practice;

import java.util.Scanner;

public class Pattern_2 {
	void printTriangle(int n) {
		String bag = "";
		for (int i = 0; i < n; i++) {
			if (i == n)
				bag += "*";
			else
				bag += "* ";
			System.out.println(bag);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many * your wanted to print: ");
		int num = scn.nextInt();
		Pattern_2 p2 = new Pattern_2();
		p2.printTriangle(num);
		scn.close();
	}
}
