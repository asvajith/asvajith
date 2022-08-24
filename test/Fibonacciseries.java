package com.fita.team2.test;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		int count=in.nextInt();
	    int n1=0;
	    int n2=1;
	    int n3;
	    for(int i=0;i<count;i++) {
	    	n3=n1+n2;
	    	
	    System.out.println(n1);	
	    n1=n2;
        n2=n3;  
		}
	    

	}

}
