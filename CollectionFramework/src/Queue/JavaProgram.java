package Queue;

import java.util.*;
public class JavaProgram {
	public static void execution() {
//		PriorityQueue<Double> pq1=new PriorityQueue<Double>();
//		pq1.add(11.11);
//		pq1.add(-22.22);
//		pq1.add(33.33);
//		pq1.add(-44.44);
//		pq1.add(55.55);
//		System.out.println(pq1);
//		
//		PriorityQueue<Double> pq2=new PriorityQueue<Double>();
//		pq2.add(11.11);
//		pq2.add(-22.22);
//		pq2.add(33.33);
//		pq2.add(-44.44);
//		pq2.add(55.55);
//		System.out.println(pq2);
//		
//		System.out.println(pq1.equals(pq2));
//		
//		System.out.println(pq1.hashCode());
//		System.out.println(pq2.hashCode());
//		
//		PriorityQueue pq3=new PriorityQueue();
//		pq3.add(11);
//		pq3.add(11);
//		pq3.add(11);
//		pq3.add(33);
//		pq3.add(55);
//		System.out.println(pq3);
//		System.out.println();
//		
//		
//		//Crud Operations on PriorityQueue
//		// Update in not allowed becoz it doesn't follows index 
//		PriorityQueue<Double> pq4=new PriorityQueue<Double>();
//		pq4.add(11.11);
//		pq4.add(-22.22);
//		pq4.add(33.33);
//		pq4.add(-44.44);
//		pq4.add(55.55);
//		System.out.println(pq4);
//		
//		for(double d:pq4) {
//			System.out.println(d);
//		}
//		pq4.remove(33.33);
//		System.out.println(pq4);
		
		
		
		PriorityQueue<Character>pq7=new PriorityQueue<Character>();
		pq7.add('j');
		pq7.add('a');
		pq7.add('v');
		pq7.add('a');
		pq7.add('c');
		
		System.out.println(pq7);
		 for(char ch:pq7)
		 {
			 System.out.println(ch);
		 }
		 pq7.remove('c');
		 System.out.println(pq7);
	}
}
