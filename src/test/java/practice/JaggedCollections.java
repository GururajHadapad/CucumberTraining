package practice;

import java.util.ArrayList;
import java.util.List;

public class JaggedCollections {
	public static void main(String[] args) {
		
	
	ArrayList<String> list1=new ArrayList<String>();
	list1.add("Happy");
	list1.add("Happiness");
	
	ArrayList<String> list2=new ArrayList<String>();
	list2.add("Happy");
	list2.add("Happiness");
	
	List<ArrayList> list3=new ArrayList<ArrayList>();
	list3.add(list1);
	list3.add(list2);
	
	
	System.out.println(list3.get(0));
	System.out.println(list3.get(0).get(0));
	}
}
