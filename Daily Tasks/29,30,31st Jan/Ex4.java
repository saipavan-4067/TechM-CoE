package org.anurag;
import java.lang.System;
public class Ex4 {
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,5,6,7,8};
		int[] arr2 = {10,20,30,40,50,60,70,80};
		System.arraycopy(arr1, 3, arr2, 0, 5);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}
}
