package org.campus.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("/temp/Textdatei1.txt");
		FileWriter fr = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fr);
		
		pw.println("Firt Line");
		pw.println("Second Line");
		
		pw.flush();
		pw.close();
	}

}
