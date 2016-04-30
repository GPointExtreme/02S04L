package org.campus.networkstream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class NetworkDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("/temp/NetworkStream.html");
		FileWriter fr = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fr);
		
		URL test = new URL("https://de.wikipedia.org/wiki/Isolde_Thormeyer");
		BufferedReader br = new BufferedReader(new InputStreamReader(test.openStream()));
		
		String line = "";
		
		while((line=br.readLine()) != null) {
			pw.println(line);
		}
		
		pw.flush();
		pw.close();
		
		br.close();
	}

}
