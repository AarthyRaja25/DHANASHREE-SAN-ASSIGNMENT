package Assignmentbasicsproblemdhanashreesan;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class hashmapusingiterator {
	public static void main(String args[]){
	HashMap<String,String>name=new HashMap<String,String>();
	name.put("0","aarthy");
	name.put("1","banu");
	name.put("2","anu");
	name.put("3","sruthi");
	
	
	//iterate through the value  
	System.out.println("Iteration");
	Iterator<Entry<String,String>> it= name.entrySet().iterator();
	 while(it.hasNext())
	 { 
		 System.out.print(it.next());
          System.out.println( ","); 
	 }
	 
	 
	 
	 
	 // printing key and values in set
   System.out.println("printing key and values");

	Set<Entry<String,String>> ent= name.entrySet();
	
	for(Entry<String,String> entry : ent)
     {
		System.out.println(entry.getKey()+" = "+ entry.getValue());
	}
	
	
	
	//Removing a element
	name.remove("0");
	System.out.println("Removed 0 th element");
	System.out.println(name);
	
	
	
	//Getting value of a key
	System.out.println("value of a key");
	String nameof1=name.get("1");
	System.out.println( nameof1);
	
	
    // printing indididual key
	System.out.println("key of a value");
	for(Entry<String,String> entry : ent)
    {	
   String value="anu";
   
	if(entry.getValue()==value)	
	{
	System.out.println(entry.getKey());	
	}
	}
	
	
	//to print all the key
	System.out.println("All keys");
	for(Entry<String,String> entry : ent)
    {	
   String value="anu";
   
   System.out.println(entry.getKey());
	}
	
	
// wheather the key is present or not
	System.out.println("Key");
	boolean string;
	if(name.containsKey("0"))
	{
		 string=true;
	}
		else
		{
			 string=false;
		}
		System.out.println(string);
		
		
		
	// wheather the value is present or not
		System.out.println("word present");
		boolean word;
		if(name.containsValue("aarthy"))
		{
			 word=true;
		}
			else
			{
				 word=false;
			}
			System.out.println(word);
		
	
	
	
	
	
	}	
	}


