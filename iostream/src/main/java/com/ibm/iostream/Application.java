package com.ibm.iostream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {

		try (FileInputStream inputStream = new FileInputStream("./src/main/resources/file1.txt");
			FileOutputStream outputStream = new FileOutputStream("./src/main/resources/file2.txt");) {

			int c;
			while ((c = inputStream.read()) !=-1) {
				outputStream.write(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		short value = 12345;
		try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("./src/main/resources/bifile1.txt"))))
		{
			out.writeShort(value);
			System.out.println(out.size());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}