package Assignmentbasicsproblemdhanashreesan;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
public class countnoofstringusinghashmap5 {
public static void main(String[] args)
{
	String Title="Hello all Welcome tozohoschool Hello all";
	String array[]=Title.split(" ");
	int count=0;
	
LinkedHashMap<String,Integer>hashmap=new LinkedHashMap<String,Integer>();
for(int i=0;i<array.length;i++)
{
	if(hashmap.containsKey(array[i]))
	{
	  hashmap.put(array[i], hashmap.get(array[i])+1);
	  count++;
    }
	else
	{
	   hashmap.put(array[i],1);
	   count++;
	}	
}


System.out.println(count);
//System.out.println(hashmap.get("Hello"));	
}	
}

