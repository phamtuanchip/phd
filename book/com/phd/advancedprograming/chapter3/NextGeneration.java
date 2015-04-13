package com.phd.advancedprograming.chapter3;

import java.util.Scanner;

public class NextGeneration {

  public static int OK = 1;
  public static int[] X = new int[100];
  public static int n ;
  public static void init(){
    System.out.print("Nhap n: ");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
  }
  public static void result(){
    for(int i =0; i< n; i++) {
      System.out.print("X["+i+"]= " + X[i] + " ");
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
  public static void main(String[] args)
   {
    // TODO Auto-generated method stub
    init();
    while(OK == 1){
      result();
      next_bit_string();
    }
  }

}
