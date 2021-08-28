package week8.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnThrows {

	public static void main(String[] args) throws FileNotFoundException  {
		File file = new File("./data/test.xlsx");
		
		FileInputStream fis = new FileInputStream(file);

	}

}
