package Assignmentbasicsproblemdhanashreesan;
import java.lang.*;
import java.util.Scanner;
public class stringreverseinbuilt2 {
public static void main(String[] args)
{	
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	StringBuilder input=new  StringBuilder();
	input.append(name);
	input.reverse();
	System.out.println(input);
	
}
}
