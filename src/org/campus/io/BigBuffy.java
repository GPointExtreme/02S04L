package org.campus.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BigBuffy {

	public static void main(String[] args) throws IOException {
		File file = new File("/temp/Textdatei.txt");
		FileReader fr = new FileReader(file);
		BufferedReader bfr = new BufferedReader(fr);
		
		String zeile;
		while((zeile=bfr.readLine()) != null) {
			System.out.println(zeile);
		}
		bfr.close();
	}

}
