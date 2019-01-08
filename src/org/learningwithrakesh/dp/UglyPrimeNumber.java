package org.learningwithrakesh.dp;

import static org.learningwithrakesh.util.Printer.sysout;

public class UglyPrimeNumber {
	private static int cacheTable[] = new int[10000];

	public static void main(String[] args) {
		int i = 150;
//		findNthUglyPrimeNumber(i);
		long startTime;
		/*
		 * startTime = System.currentTimeMillis(); while (i <= 150) {
		 * findNthUglyPrimeNumber(i, false); i++; } sysout("Program running time: " +
		 * (System.currentTimeMillis() - startTime));
		 */
		startTime = System.currentTimeMillis();
		findNthUglyPrimeNumber(150, true);
		sysout("Program running time: " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		sysout("\n"+findNthUglyNumber(150));
		sysout("\nProgram running time: " + (System.currentTimeMillis() - startTime));
	}

	public static void findNthUglyPrimeNumber(int n, boolean isUsingDp) {
		int i = 1, counter = 1, uglyPrime = 1;
		while (counter <= n) {
			uglyPrime = i;
			if (isUsingDp) {
				if (isUglyPrimeNumberUsingMemozation(i)) {
					cacheTable[i] = 1;
					counter++;
				}
			} else {
				if (isUglyPrimeNumber(i)) {
					counter++;
				}
			}
			i++;
		}
		sysout("n = " + n + ", ugly prime = " + uglyPrime + "\n");
	}

	public static boolean isUglyPrimeNumber(int n) {
		if (n == 0 || n == 1) {
			return true;
		}
		if (n % 2 == 0)
			return isUglyPrimeNumber(n / 2);
		if (n % 3 == 0)
			return isUglyPrimeNumber(n / 3);
		if (n % 5 == 0)
			return isUglyPrimeNumber(n / 5);
		return false;
	}

	// using memoziation

	public static boolean isUglyPrimeNumberUsingMemozation(int n) {
		if (n == 0 || n == 1) {
			return true;
		}
		if (cacheTable[n] == 1) {
			return true;
		} else {
			if (n % 2 == 0)
				return isUglyPrimeNumberUsingMemozation(n / 2);
			if (n % 3 == 0)
				return isUglyPrimeNumberUsingMemozation(n / 3);
			if (n % 5 == 0)
				return isUglyPrimeNumberUsingMemozation(n / 5);
			return false;
		}
	}

	// geeksforgeeks solutions

	public static int findNthUglyNumber(int n) {
		int uglyNos[] = new int[n+1];
		int nx2 = 2 ,i2, nx3 = 3, i3, nx5 = 5,i5, nextUglyNum;
		i2 = i3 = i5 =0;
		uglyNos[0] = nextUglyNum = 1;
		for(int i=1;i<n;i++) {
			nextUglyNum = Math.min(nx2,Math.min(nx3, nx5));
			uglyNos[i] = nextUglyNum;
			if(nextUglyNum == nx2) {
				i2 = i2+1;
				nx2 = uglyNos[i2] * 2 ;
			}
			if(nextUglyNum == nx3) {
				i3 = i3+1;
				nx3 = uglyNos[i3] * 3;
			}
			if(nextUglyNum == nx5) {
				i5 = i5+1;
				nx5 = uglyNos[i5] * 5;
			}
			
		}
		return nextUglyNum;
	}

}
