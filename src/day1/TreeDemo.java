package day1;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		//adding elements to treemap
		tmap.put(105,"swathi");
		tmap.put(102,"venkat");
		tmap.put(101,"janu");
		tmap.put(104,"Anu");
		tmap.put(103,"balu");
		for (Entry<Integer, String>  e: tmap.entrySet()) {
	        System.out.println(e.getKey() + " , "+e.getValue());
	    }
		
		System.out.println("All the employee details are:"+tmap);
		
		

	}

}
