import java.util.*;
import java.io.*;  


  class mainc1
  {
    public static void main(String a[])
	throws IOException 
	{
	  
	  
	  String str;
	  int n;
	  int i;
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Please enter the size ...");
	  str=br.readLine();
	  n=Integer.parseInt(str);
	  
     
     String str1;
	 LinkedList obj1=new LinkedList(); 
	 System.out.println("Please enter the values into the list ...");
	 Object v=0;
	 for(i=0;i<n;i++)
	 {
	 str1=br.readLine();
	 v=Integer.parseInt(str1);
	 obj1.add(v);
	 }
	 System.out.println("The values are ...");
	 System.out.println(obj1);
	 
	 Object val=obj1.get(2);
	 obj1.set(2,val);
	 System.out.println("The third value is ..."+val);
	 
     System.out.println("remove the fourth element");
	
     obj1.remove(3);
	 System.out.println("after deleting...the values are:"+obj1);
	}  
  }
  
 