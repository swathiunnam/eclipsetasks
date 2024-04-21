package day1;

import java.util.ArrayList;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Integer []intArray=new Integer[list.size()];
		list.toArray(intArray);
		for(Integer integer : intArray)
		{
			System.out.println(integer);
		}
		

	}

}
