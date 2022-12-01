//Question
//https://practice.geeksforgeeks.org/problems/triangle-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_5
package com.practice;

import java.util.Scanner;

public class Pattern_5 {
	void printTriangle(int n) {

		for (int i = n; i > 0; i--) {
			String bag = "";
			for (int j = 0; j < i; j++) {
				if (j == n)
					bag += "*";
				else
					bag += "* ";
			}

			System.out.println(bag);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many * your wanted to print: ");
		int num = scn.nextInt();
		Pattern_5 p5 = new Pattern_5();
		p5.printTriangle(num);
		scn.close();
	}

}
