package neues;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
	
	public static void main(String[] args) {
		
		String path = "C:\\CurtsJava\\JavaTraining\\GitHub\\Training\\src\\neues\\TryWithResourcesDemo.java";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			   System.out.println(br.readLine());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
