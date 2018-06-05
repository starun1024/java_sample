package com.mycompany.app;

public class Math {
	
  public static boolean isPrime(long num)
  {
	  boolean isPrime = true;
	  for(long i=2 ;i<=java.lang.Math.sqrt(num);i++)
	  {
		  if(num%i == 0)
		  {
			  isPrime=false;
			  break;
		  }
	  }
	  
	  return isPrime;
  }
}
