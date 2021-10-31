package facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Array {
	

	
	public static void main(String[] args) {
	
		
		ArrayList arr = new ArrayList();
		
		arr.add(45);
		arr.add("velocity");
		arr.add("&");
		
		System.out.println("Arraylist");
		System.out.println(arr.get(2));
		System.out.println(arr.get(1));
		System.out.println(arr.get(0));
		
		
		
		
		ArrayList<Integer> i = new ArrayList<Integer>();
		
		i.add(456);
		i.add(12);
		i.add(121);
		i.add(456);
		
		System.out.println(i.get(3));
		System.out.println(i.get(2));
		System.out.println(i.get(1));
		System.out.println(i.get(0));
		
	System.out.println("====================================");	
		
System.out.println("Hash");		
		
		HashSet<String> hash = new HashSet<String>();
		hash.add("velocity");
		hash.add("katraj");
		hash.add("2021");
		
		Iterator<String> j = hash.iterator();
		for(String d : hash)
		{
			
		System.out.println(j.next());
	
	}
		System.out.println("while");
		j = hash.iterator();

	while(j.hasNext()) {
		
		System.out.println(j.next());
		
	}
	
	
	System.out.println("==============================");
	System.out.println("hashMap");
	
	
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	
	map.put(45, "velocity");
	map.put(75, "katraj");
	map.put(null, null);
	map.put(85, null);
	
	for(Map.Entry<Integer, String> m : map.entrySet()) {
		
	System.out.println("Key= " + m.getKey() + " Value = " + m.getValue() );	
		
	}
	
	System.out.println("===========================");
	
	map.put(75, "pune");
	for(Map.Entry<Integer, String> m : map.entrySet()) {
		
	System.out.println("Key= " + m.getKey() + " Value = " + m.getValue() );	
	
	}
	System.out.println("===========================");
	System.out.println("Hashtable");
	
Hashtable<Integer,String> table = new Hashtable<Integer,String>();
	
	table.put(45, "velocity");
	table.put(75, "katraj");
	table.put(55, "batch");
	table.put(null, "2021");
	
	for(Map.Entry<Integer, String> m : table.entrySet()) {
		
	System.out.println("Key= " + m.getKey() + " Value = " + m.getValue() );	
		
	}
}
}
