package Array1;
//package com.utt.gd;

import java.util.Arrays;

public class Ary5 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] a={90,2,12,60,50,200,790,1500};
		int[] b={30,80,52,180,458,1255,1300};

		int big=biggestVal(a,b);
		System.out.println("second biggest number "+big);

	}

	private static int biggestVal(int[] a, int[] b)
	{
		int[] ab=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++)
		{
			ab[i]=a[i];
		}
		int index=a.length;
		for (int i =0; i < b.length; i++)
		{
			ab[index]=b[i];
			index++;
		}

		Arrays.sort(ab);
		int secondBig=ab.length-2;
		return ab[secondBig];
	}

}