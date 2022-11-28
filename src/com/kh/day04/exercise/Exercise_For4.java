package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {
	public static void main(String[] args) {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		// if문으로 조건을 먼저 걸고 for문으로 들어가야해
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int dan = sc.nextInt();
		int i = 0;
		if ((dan >= 1) && (dan <= 9)) {
			for (i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		} else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다");
		}
	}
}
