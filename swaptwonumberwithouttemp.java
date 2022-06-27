package Assignmentbasicsproblemdhanashreesan;
import java.util.Scanner;
public class swaptwonumberwithouttemp {
public static void main(String[] args)
{
	
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();//5
	int b=in.nextInt();//3
	a=a-b;//a=5-3=2
	b=a+b;//b=2+3=5
	a=b-a;//a=5-2=3
	System.out.println(a);
	System.out.println(b);	
	
}
}
