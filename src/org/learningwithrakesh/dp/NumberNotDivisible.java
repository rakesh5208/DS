package org.learningwithrakesh.dp;

import java.util.*;
import static org.learningwithrakesh.util.Printer.sysout;


/**
 * You will be given a positive integer N. Your task is to find the number of
 * positive integers K ≤ N such that K is not divisible by any number among the
 * set {2,3,4,5,6,7,8,9,10}.
 * 
 * @author mani
 *
 */
public class NumberNotDivisible {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		long arr[] = {100,200,300,400,500};
//		int t = Integer.parseInt(scan.nextLine());
		int t = arr.length;
		for(int i=0;i<t;i++) {
//			long n = Long.parseLong(scan.nextLine());
			sysout(notDivisibleBy(arr[i])+"\n");
		}
	}
	private static long findNumberOf(long n) {
		long counter = 0;
		for(long i=1;i<=n;i++) {
			if(isDivisibleBy2To10(i)) {
				counter++;
			}
		}
		return counter;
	}
	private static boolean isDivisibleBy2To10(long n) {
		for (int i = 2; i <= 10; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	private static long notDivisibleBy(long n){
		
	     long totalDiv = n/2+n/3+n/5+n/7 - n/6-n/10-n/14-n/15-n/21-n/35-n/30-n/70-n/42-n/105+n/210;
	     return n-totalDiv;
	}
}
