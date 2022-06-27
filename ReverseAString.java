package Assignmentbasicsproblemdhanashreesan;
import java.util.Scanner;
public class ReverseAString {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String name=sc.next();
	
//	char ch[]=name.toCharArray();
//	for(int i=name.length()-1;i>=0;i--)
//	{
//		System.out.print(ch[i]);
//	}	

	StringBuilder str=new StringBuilder();
	str.append(name);
	str.reverse();
	
	System.out.println(str);
	
	
	
	
	
}	
}
//	
//	String empty="";
//	for(int i=0;i<name.length();i++) {
//		char ch=name.charAt(i);
//		empty=ch+empty;	
//		
//	}
	//System.out.println(empty);
	
//}	
//}
	
	
	
	
	
	
	
	
	
	
	
	
	


