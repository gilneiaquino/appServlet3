package br.com.servlet.teste;

import java.util.Scanner;

public class Teste {
	
	   static long aVeryBigSum(int n, long[] ar) {
		   long soma = 0l;
		   
		for (long l : ar) {
			soma = soma +l;
		}
	        
		   return soma;
	    }
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        long[] ar = new long[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextLong();
	        }
	        long result = aVeryBigSum(n, ar);
	        System.out.println(result);
	    }

}
