//Question
//https://practice.geeksforgeeks.org/problems/square-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_1

package com.practice;

import java.util.Scanner;

public class Pattern_1 {
	void printSquare(int n) {

		for (int i = 0; i < n; i++) {
			String bag = "";
			for (int j = 0; j < n; j++) {
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
		Pattern_1 p1 = new Pattern_1();
		p1.printSquare(num);
		scn.close();
	}
}
