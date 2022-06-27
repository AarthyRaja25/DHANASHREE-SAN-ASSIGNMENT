package Assignmentbasicsproblemdhanashreesan;
import java.util.Scanner;
public class primeornot {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	if(a==0 || a==1)
	{
		System.out.println("0 and 1 are not a prime nuumer");	
	}	
int count=0;
	for(int i=2;i<=a/2;i++)
	{
		if(a%i==0)
		count++	;
	}		
			
			
		if(count>=1)	
		{
			System.out.println("Not prime number");
		}
		else
		{
			System.out.println("Prime number");
		}
	}
			
	}


