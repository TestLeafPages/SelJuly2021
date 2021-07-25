package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Set<String> setValues = new LinkedHashSet<String>();
	// add 
	setValues.add("JAVA");
	setValues.add("RUBY");
	setValues.add("PERL");
	setValues.add("PYTHON");
	
	// no get(index) in set
	// normal for loop with iterator cannot be used
	System.out.println(" SET VALUES WITH FOR EACH");
	for (String eachString : setValues) {
		System.out.println(eachString);
	}
	
	// convert into a list
	List<String> copyValues = new ArrayList<String>(setValues);
	// you can use get(i)
	System.out.println(" list values");
	for (String eachString : copyValues) {
		System.out.println(eachString);
	}
	
		
	}
}
