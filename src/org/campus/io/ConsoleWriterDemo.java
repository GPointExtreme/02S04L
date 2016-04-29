package org.campus.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsoleWriterDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("/temp/Textdatei2.txt");
		FileWriter fr = new FileWriter(file, true); //durch true wird das file nicht überschrieben sondern dazugehängt!
		PrintWriter pw = new PrintWriter(fr);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		while(!(line = br.readLine()).equals("stop")) {
			pw.println(line);
		}
		br.close();
		pw.flush();
		pw.close();

	}

}
