package com.phd.advancedprograming.chapter3;

import java.util.Scanner;

public class NextGeneration {

  public static int OK = 1;
  public static int[] X = new int[100];
  public static int n;
  public static int k;
  public static void init(){
	System.out.println();
    System.out.print("Nhap n: ");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    OK = 1;
    for (int i=1; i<=n; i++)
        X[i] =0;

  }
  
  public static void init2(){
		System.out.println();
	    System.out.print("Nhap n: ");
	    Scanner s = new Scanner(System.in);
	    n = s.nextInt();
	    System.out.print("Nhap k: ");
	    s = new Scanner(System.in);
	    k = s.nextInt();
	    OK = 1;
	     for (int i=1; i<=k; i++)
	         X[i] =i;

	  }
  
  public static void result(){
    for(int i =1; i<=n; i++) {
      System.out.print(X[i]);
      if(i % n == 0) System.out.print(" ");
    }
    
  }
  public static void result2(){
	    for(int i =1; i<=k; i++) {
	      System.out.print(X[i]);
	      if(i % k == 0) System.out.print(" ");
	    }
	    
	  }
  
  public static void init3 (){
	  System.out.print("\n Nhap n: ");
	    Scanner s = new Scanner(System.in);
	    n = s.nextInt();
	     for (int i=1; i<=n; i++)
	         X[i] =i;
	     OK = 1;
	}
	public static void result3(){
	     
	     for (int i=1; i<=n; i++) {
	    	 System.out.print(X[i]);
	         if(i % n == 0) System.out.print(" ");
	     }
	      
	}

  
  public static void next_bit_string(){
    int i = n ;
    while(i> 0 && X[i]!= 0) {
      X[i] = 0;
      i--;
    }
    if(i > 0) X[i] = 1;
    else OK = 0;
    
  }
  
  public static void next_combination() {
	     int i= k;
	     while (i>0 && X[i]==n-k+i)i--;
	     if (i > 0 ) {
	        X[i] = X[i] +1;
	        for (int j = i+1; j<=k; j++)
	            X[j] = X[i] + j - i;
	     }
	     else OK = 0;
	}

		
  public static void next_permutation() {
	     int j= n-1;
	     while (j>0 && X[j]>X[j+1]) j--;
	     if (j > 0 ) {
	        int k =n;
	        while(X[j]>X[k]) k--;
	        int t = X[j]; X[j]=X[k]; X[k]=t;
	        int r = j +1, s =n;
	        while (r<=s ) {
	              t = X[r]; X[r]=X[s]; X[s] =t;
	              r ++; s--;
	        }
	     }
	     else OK = 0;
	}

  public static void main(String[] args)
   {
    // TODO Auto-generated method stub
    init();
    while(OK == 1){
      result();
      next_bit_string();  
    }
    
    init2();
    while(OK == 1){
        result2();
        next_combination();
      }
    
    init3();
    while(OK == 1){
        result3();
        next_permutation();
      }
    
  
  }

}
