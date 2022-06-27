package Assignmentbasicsproblemdhanashreesan;
import java.util.Scanner;
public class timeconverter {
public static void main(String[] args)	
{
 Scanner sc=new Scanner(System.in);
 System.out.println("ENTER THE STRING");
 String time=sc.next();
 char ch[]=time.toCharArray();
 int n=ch.length;
	if(ch[8]=='A')
	{
		if(ch[0]=='1' && ch[1]=='2')
		{
			ch[0]='0';
			ch[1]='0';
		}
	}
	if(ch[8]=='P')
	{
		if(ch[0]=='1' && ch[0]=='2')
		{
			ch[0]='1';
			ch[1]='2';
		}
		else if(ch[1]=='8')
		{
			ch[0]='2';
			ch[1]='0';
		}
		else if(ch[1]=='9')
		{
			ch[0]='2';
			ch[1]='1';
		}
		else if(ch[0]!='1' || ch[0]!='2')
		{
			ch[0]+=1;
			ch[1]+=2;
		}
	}
		String str=" ";	
	for(int i=0;i<n-2;i++)
	{
	str=str+ch[i];
	}
		System.out.println(str);
	}
	 
 }	
	

	
	
	
	
	


