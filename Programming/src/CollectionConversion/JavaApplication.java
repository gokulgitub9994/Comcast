package CollectionConversion;
import java.util.*;

public interface JavaApplication {
	public static void execution()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=5;i++)
		{
			al.add(i);
		}
		System.out.println("ArrayList");
		System.out.println(al);
		
		PriorityQueue<Integer> al2=new PriorityQueue<Integer>(al);
		System.out.println("ArrayList to PriorityQueue");
		System.out.println(al2);
		
		ArrayList<Integer> al3=new ArrayList<Integer>(al2);
		System.out.println("PriorityQueue to Arraylist");
		System.out.println(al3);
		
		HashSet<Integer>al4=new HashSet<Integer>(al3);
		System.out.println("ArrayList to HashSet");
		System.out.println(al4);
		
		ArrayList<Integer> al5=new ArrayList<Integer>(al4);
		System.out.println("HashSet to Arraylist");
		System.out.println(al5);
		
		PriorityQueue<Integer> al6=new PriorityQueue<Integer>(al3);
		System.out.println("HashSet to PriorityQueue");
		System.out.println(al6);
		
		HashSet<Integer>al7=new HashSet<Integer>(al6);
		System.out.println("HashSet to Priority Queue");
		System.out.println(al7);
		
	}
}
