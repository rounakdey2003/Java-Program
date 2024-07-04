import java.util.*;

public class linked_list
{
	public static void main(String[] args)
	{
		LinkedList<String> arr = new LinkedList<String>();
		
		arr.add("10");
		arr.add("20");
		arr.add("30");
		arr.add("40");

		System.out.println("\nOriginal List : " + arr + "\n");
		
		Collections.swap(arr, 0, 1);
        Collections.swap(arr, 2, 3);
		System.out.println("Modified list (1<->2,3<->4) : " + arr + "\n");
		
		arr.remove(1);
		arr.addFirst("first");
		System.out.println("Modified List 1 : " + arr + "\n");
		
		arr.remove("first");
		arr.addLast("last");
		System.out.println("Modified List 2 : " + arr + "\n");
		
		arr.addFirst("first");
		System.out.println("Modified List 3 : " + arr);
		
	}
}
