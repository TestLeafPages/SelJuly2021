package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

	// Create an empty list
	List<String> values = new ArrayList<String>();
	// add the values to the list
	values.add("JAVA");
	values.add("Python");
	values.add("Ruby");
	values.add("DOT NET");
	
	System.out.println(" List values:" +values);
	
	// Size of the list
	int size = values.size();
	System.out.println(" Size of the list:" + size);
	
	//Get the value in a list based on Index
	System.out.println(" elemnet : " + values.get(0));
	
	// Insert a value at a desired position
	values.add(2,"C SHARP");
	System.out.println(" List values:" +values);
	
	// Remove a element from the list using the index
	values.remove(2);
	System.out.println(" List values:" +values);
	
	// Remove a element from the list using the text
	values.remove("JAVA");
	System.out.println(" List values:" +values);
	
	// Flush out all the entries in the list
    //.clear();
    //	System.out.println(" List values:" +values);
	
	// sort a list
	Collections.sort(values);
	System.out.println(values);
	
	// Reversing the list
	Collections.reverse(values);
	System.out.println(" reversed List:" + values);
	
	// FOR EACH ELEMENT
	// dataType  userdefinedVariable  : source
	// no index 
	
	System.out.println(" Using FOR EACH");
	for (String eachString : values) {
		System.out.println(eachString);
	}
	
	System.out.println(" NORMAL FOR LOOP");
	for (int i = 0; i < values.size(); i++) {
		String string = values.get(i);
		System.out.println(string);
	}
	
	// copy from one list to another list
	// open a empty list
	System.out.println(" COPIED LIST");
	List<String> copyValues = new ArrayList<String>(values);
	for (String eachString : copyValues) {
		System.out.println(eachString);
	}
	
	copyValues.add("BIg DATA");
	copyValues.add("HADOOP");
	System.out.println(" new values added to the COPIED LIST");
	for (String eachString : copyValues) {
		System.out.println(eachString);
	}
	
	// remmove all the entries that are present in the values list
	copyValues.removeAll(values);
	System.out.println(" removed values added to the COPIED LIST");
	for (String eachString : copyValues) {
		System.out.println(eachString);
	}
	
	// retainAll()
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
