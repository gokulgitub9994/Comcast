package CollectionConversion;

import java.util.*;
import java.util.Map.Entry;
public interface Sets_to_Map {
	public static void execution1()
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Double>al2=new ArrayList<Double>();
		for(int i=1;i<=5;i++)
		{
			al1.add(i);
		}
		for(double d=1.1;d<=5.1;d++)
		{
			al2.add(d);
		}
		HashMap<Integer,Double> map=new HashMap<Integer,Double>();
		if(al1.size()==al2.size())
		{
			for(int i=0;i<al1.size();i++)
			{
				map.put(al1.get(i), al2.get(i));
			}
		}
		System.out.println("ArrayList to HashMap");
		for(Entry<Integer, Double> e:map.entrySet())
		{
			System.out.println(e.getKey()+e.getValue());
		}
		System.out.println(map);
		
		ArrayList<Integer> key=new ArrayList<Integer>();
		ArrayList<Double>values=new ArrayList<Double>();
		for(Entry<Integer, Double> e1:map.entrySet())
		{
			key.add(e1.getKey());
			values.add(e1.getValue());
		}
		System.out.println("Keys:"+key);
		System.out.println("Values:"+values);
	}
}
