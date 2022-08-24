package com.fita.team2.test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
	Scanner input =new Scanner (System.in);
	
	int a =input.nextInt();
	boolean prime = true;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			
			prime = false;
			break;
		}
	}
		if (prime ==true){
		System.out.println("the number is prime "+a );
	}else
	{
		System.out.println("not prime");
		}
		
	}
	}




