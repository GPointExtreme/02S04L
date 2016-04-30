package org.campus.networkstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket test = new Socket("news.orf.at", 80);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(test.getOutputStream()));
		
		bw.write("GET / HTTP1.1 \r\nHost: news.orf.at\r\n\r\n");
		bw.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(test.getInputStream()));
		PrintWriter pw = new PrintWriter(new FileWriter(new File("/temp/CLientProgram.txt")));
		
		String line = "";
		
		while((line=br.readLine()) != null) {
			pw.println(line);
		}
		pw.flush();
		pw.close();
		
		bw.close();
		test.close();
	}

}
