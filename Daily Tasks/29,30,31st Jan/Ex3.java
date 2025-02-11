package org.anurag;
import java.util.Scanner;
import java.lang.System;
public class Ex3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2,res;
		System.out.println("Accept the Values in num1 : ");
		num1 = sc.nextInt();
		System.out.println("Accept the Values in num2 : ");
		num2 = sc.nextInt();
		res = num1 + num2;
		System.out.println("Result is : " + res);
	}
}
