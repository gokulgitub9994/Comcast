package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
public class JavaProgram {
	public static void execution() {
		HashMap<Integer, Double> hm1=new HashMap<Integer, Double>();
		hm1.put(1, 11.11);
		hm1.put(2, 22.22);
		hm1.put(3, 33.33);
		hm1.put(4, 44.44);
		hm1.put(7, 77.77);
		hm1.put(8, 88.88);
		System.out.println(hm1);
	
		HashMap<Integer, Double> hm2=new HashMap<Integer, Double>();
		hm2.put(1, 11.11);
		hm2.put(2, 22.22);
		hm2.put(3, 33.33);
		hm2.put(4, 44.44);
		hm2.put(7, 77.77);
		hm2.put(8, 88.88);
		System.out.println(hm2);
		for(Entry<Integer,Double> e:hm2.entrySet()) {
			System.out.println(e.getKey()+e.getValue());
		}
		
		System.out.println(hm1.equals(hm2));
		
		System.out.println(hm1.hashCode());
		System.out.println(hm2.hashCode());
		
		
		HashMap hm3=new HashMap();
		hm3.put(1, "java");
		hm3.put(1.1, 123);
		hm3.put(true, "core");
		hm3.put('k', 22.22);
		hm3.put("sql",'S');
		System.out.println(hm3);
		
		for(Object ob:hm3.entrySet())
		{
			System.out.println(ob);
		}
		hm3.put('k', "Kalai");
		System.out.println(hm3);
		hm3.remove("sql");
		System.out.println(hm3);
	}
}
