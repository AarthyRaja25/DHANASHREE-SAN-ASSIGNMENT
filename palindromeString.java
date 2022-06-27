package Assignmentbasicsproblemdhanashreesan;
import java.util.Scanner;
import java.util.*;
public class palindromeString {
	public static void main(String[] args) {
		
	Scanner in=new Scanner(System.in);
	String name=in.next();
	String reverse=" ";
	for(int i=name.length()-1;i>=0;i--)
	{
		reverse=reverse+name.charAt(i);
	}
	System.out.println(reverse);
	if(name.equals(reverse))
	{
		System.out.println(" not palindrome");
	}
	else 
	{
		System.out.println(" palindrome");
	
	}
		
		
		
	}

}
