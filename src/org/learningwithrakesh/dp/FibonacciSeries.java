package org.learningwithrakesh.dp;

import static org.learningwithrakesh.util.Printer.sysout;

public class FibonacciSeries {
		private static long fiboCache[] = new long[1000];
		
		public static void main(String ...args) {
			long startTime = System.currentTimeMillis();
//			sysout(fib(50));
			sysout("\nTotal running time :"+ (System.currentTimeMillis()-startTime)+"ms");
			startTime = System.currentTimeMillis();
			sysout("\n"+fibo(50));
			sysout("\nTotal running time :"+ (System.currentTimeMillis()-startTime)+"ms");
		}
		// normal recursive 
		public static long fib(int n) {
			if(n==0 || n==1) {
				return 1;
			}
			return fib(n-1)+fib(n-2);
		}
		// using DP memoization
		private static long fibo(int n) {
			if(n == 0 || n == 1) {
				return 1;
			}
			if(fiboCache[n]!= 0) {
				return fiboCache[n];
			}
			return fiboCache[n] = fibo(n-1)+fibo(n-2);
		}
		
		
}
