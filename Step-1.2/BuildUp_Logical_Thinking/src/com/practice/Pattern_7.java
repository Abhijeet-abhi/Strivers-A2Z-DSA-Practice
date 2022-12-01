//Question
//https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_7

package com.practice;

import java.util.Scanner;

public class Pattern_7 {

	void printTriangle(int n) {
		int rows = n, k = 0;

		for (int i = 1; i <= rows; ++i, k = 0) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print(" ");
			}

			while (k != 2 * i - 1) {
				System.out.print("*");
				++k;
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many * your wanted to print: ");
		int num = scn.nextInt();
		Pattern_7 p7 = new Pattern_7();
		p7.printTriangle(num);
		scn.close();
	}

}
