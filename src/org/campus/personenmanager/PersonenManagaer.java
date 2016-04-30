package org.campus.personenmanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonenManagaer {
	
	private ArrayList<Person> list = new ArrayList<>();
	
	public void load (String path) throws PersonenManagerException {
		
		File file = new File(path);
		
		try(FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
			
			String line = "";
			if(line.length() != 3) {
				throw new PersonenManagerException("Ungültige Zeile" + line);
			}
			while((line = br.readLine()) != null) {
				String[] colums = line.split(",");
				Person p = new Person(colums[0], colums[1], colums[2]);
				list.add(p);
			}
		}
		catch(FileNotFoundException e) {
			throw new PersonenManagerException(e);
		}
		catch(IOException e1) {
			throw new PersonenManagerException(e1);
		}
		
	}

	public ArrayList<Person> getList() {
		return list;
	}

}
