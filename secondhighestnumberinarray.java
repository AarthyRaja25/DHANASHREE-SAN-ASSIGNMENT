package Assignmentbasicsproblemdhanashreesan;
import java.util.Scanner;
public class secondhighestnumberinarray {
public static void main(String[] args)
{
Scanner in= new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	
arr[i]	=in.nextInt();
}

int max=arr[0];
for(int i=0;i<n;i++)
{
	if(arr[i]>max)
	{
		max=arr[i];
	}
	//System.out.println(max);
	
}
System.out.println(max);
int max2=arr[0];
for(int i=0;i<n;i++) {
	if(max2<arr[i] && arr[i]>max) {
		max=arr[i];
	}
	//System.out.println(max2);
}
System.out.println(max2);	
	
	
	
	
	}
	}
		
	
	
	
	
	


