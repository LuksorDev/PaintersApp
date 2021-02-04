package ch.makery.painters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class aaa {

	public static void main(String[] args) throws IOException{
	Reader r = new InputStreamReader(new FileInputStream("src\\ch\\makery\\painters\\model\\malarze\\&nbsp;Aleksander Gierymski.txt"), "ISO8859-2");
	Scanner sc = new Scanner(r);
	while(sc.hasNextLine()){
		String line = sc.nextLine();
		String cols[] = line.split("\t");
		for (String s:cols)
			System.out.print(s + "***");
		System.out.println("\n-----------");
	}
	sc.close();
	File f = new File("C:\\Users\\Luksor\\eclipse-workspace\\PaintersApp\\src\\ch\\makery\\painters\\model\\malarze");
	File[] matchingFiles = f.listFiles(new FilenameFilter() {
		public boolean accept(File dir,String name) {
			return name.endsWith("txt");
		}
	});
	for(File ff: matchingFiles)
		System.out.println(ff.getName());
	}
}

	


