package Assignmentbasicsproblemdhanashreesan;
import java.util.Scanner;
public class timeconverterusingsplit {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
	 String str=sc.nextLine();
	 
	 String arr[]=str.split(":");
	 for(int i=0;i<arr.length;i++)
	 {
		
	 System.out.print(arr[i]);
	 }
	 String result=" ";
	 if(str.contains("AM"))
	 {
		if(arr[0].equals(12))
		{
			arr[0]="00";
			result=String.join(":", arr).replace("AM","HRS");
			
		}
		else
		{
			result=String.join(":",arr).replace("AM","HRS");
		}
	 }
		else
		{
			if(!arr[0].equals(12))
			{
			arr[0]=String.valueOf(12+Integer.parseInt(arr[0]));
			
		    result= String.join(":", arr).replace("PM","HRS");
		   
			}
	 }
	 System.out.println(result);
 }		 
	 
 }	 
