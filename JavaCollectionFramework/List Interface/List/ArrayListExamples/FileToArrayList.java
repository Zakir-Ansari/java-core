package List.ArrayListExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileToArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		try {
			Scanner s = new Scanner(new File("D:\\1. Learnings\\Programs\\Eclipse\\Core-Java\\JavaCollectionFramework\\Resources"));
			
			while(s.hasNext()) {
				list.add(s.next());
			}
			s.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
		
}
